package com.example.randomchuckfact.data.di

import com.example.randomchuckfact.data.repository.JokeRepositoryImpl
import com.example.randomchuckfact.data.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BASE_URL = "https://api.chucknorris.io"

    @Singleton
    @Provides
    fun provideRetrofitInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit : Retrofit) : ApiService{
        return retrofit.create(ApiService::class.java)
    }

    @Singleton
    @Provides
    fun provideJokeRepository(apiService: ApiService) : JokeRepositoryImpl{
        return JokeRepositoryImpl(apiService)
    }
}