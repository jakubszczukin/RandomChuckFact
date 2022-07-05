package com.example.randomchuckfact.data.service

import com.example.randomchuckfact.data.model.ChuckJoke
import retrofit2.http.GET

interface ApiService {

    /**
     *
     * Retrieve a random chuck joke in JSON format.
     *
     */
    @GET("jokes/random")
    suspend fun getRandomChuckJoke() : ChuckJoke
}