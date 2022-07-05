package com.example.randomchuckfact.data.repository

import com.example.randomchuckfact.data.model.ChuckJoke

interface JokeRepository {
    suspend fun getRandomChuckJoke() : ChuckJoke
}