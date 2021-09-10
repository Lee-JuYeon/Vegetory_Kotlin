package com.example.fooddelivery.vm

import androidx.lifecycle.*
import com.example.fooddelivery.repository.MainRepository
import com.example.fooddelivery.util.strings.Strings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class MainVM : ViewModel() {
    private val mainRepository = MainRepository()

    private val fragmentType = MutableLiveData<String>("")
    fun setFragmentType(type : String){ fragmentType.value = type }
    val getFragmentType : LiveData<String>
        get() = flow{
            while(true){
                emit(fragmentType.value ?: Strings.DOCK_RECIPE)
            }
        }.flowOn(Dispatchers.IO).asLiveData()

    val readTxt : LiveData<String>
        get() = mainRepository.fetchReadText().asLiveData()

//    private lateinit var repository : MainVMRepository

    init{
    }


}