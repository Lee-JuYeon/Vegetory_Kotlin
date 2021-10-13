package com.example.fooddelivery.server.api

import android.util.Log
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object RetrofitClient {
    // retrofit client declaration
    private var retrofit : Retrofit? = null

    // get retrofit client
    fun getRetrofitClient(baseURL : String) : Retrofit? {
        // make okhttp instance
        val okHttpInstance = OkHttpClient.Builder()

        // logging Interceptor
        val loggingInterceptor = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger{
            override fun log(message: String) {
                when{
                    message.startsWith("{") && message.endsWith("}") -> {
                        Log.e("mException", "RetrofitClient, getRetrofitClient, loggingInterceptor, JSONObject // ${JSONObject(message).toString(4)}")
                    }
                    message.startsWith("[") && message.endsWith("]") -> {
                        Log.e("mException", "RetrofitClient, getRetrofitClient, loggingInterceptor, JSONArray // ${JSONObject(message).toString(4)}")
                    }
                    else -> {
                        try {
                            Log.e("mException", "RetrofitClient, getRetrofitClient, loggingInterceptor, String // ${JSONObject(message).toString(4)}")
                        }catch (e:Exception){
                            Log.e("mException", "RetrofitClient, getRetrofitClient, loggingInterceptor // Exception : ${e.message}")
                        }
                    }
                }
            }
        })
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        okHttpInstance.addInterceptor(loggingInterceptor)

        // add basic parameter
        val baseParameterInterceptor : Interceptor = (object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                // original request
                val originalRequest = chain.request()

                // add query parameter
                val addedURL = originalRequest.url.newBuilder()
                    .addQueryParameter("client_id", API.ADDRESS_KEY)
                    .build()

                val finalRequest = originalRequest.newBuilder()
                    .url(addedURL)
                    .method(originalRequest.method, originalRequest.body)
                    .build()

                var response = chain.proceed(finalRequest)
                when(response.code){
                    200 -> {

                    }
                    else -> {
                        Log.e("mException", "RetrofitClient, baseParameterInterceptor, response.code // ${response.code}")
                    }
                }
                return response
            }
        })

        // 위에서 설정한 기본 파라미터 인터셉터를 okhttp 클라이언트에 추가한다.
        okHttpInstance.addInterceptor(baseParameterInterceptor)
        okHttpInstance.let {
            it.connectTimeout(10, TimeUnit.SECONDS)
            it.readTimeout(10, TimeUnit.SECONDS)
            it.writeTimeout(10, TimeUnit.SECONDS)
            it.retryOnConnectionFailure(true)
        }


    }
}