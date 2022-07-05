package com.example.randomchuckfact.data.repository

import com.example.randomchuckfact.data.model.ChuckJoke
import com.example.randomchuckfact.data.service.ApiService
import javax.inject.Inject

class JokeRepositoryImpl @Inject constructor(private val apiService: ApiService) : JokeRepository {
    override suspend fun getRandomChuckJoke(): ChuckJoke {
        return apiService.getRandomChuckJoke()
    }

}