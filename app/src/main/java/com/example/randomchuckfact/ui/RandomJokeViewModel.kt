package com.example.randomchuckfact.ui

import androidx.lifecycle.*
import com.example.randomchuckfact.data.model.ChuckJoke
import com.example.randomchuckfact.data.repository.JokeRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RandomJokeViewModel @Inject constructor(private val repositoryImpl: JokeRepositoryImpl) : ViewModel(){
    private val _randomJoke : MutableLiveData<ChuckJoke> = MutableLiveData()
    val randomJoke : LiveData<ChuckJoke>
        get() = _randomJoke

    fun fetchRandomChuckJoke(){
        viewModelScope.launch{
            val randomJoke = repositoryImpl.getRandomChuckJoke()
            _randomJoke.value = randomJoke

        }
    }
}