package com.amolina.data.model.di

import com.amolina.data.model.api.ApiService
import com.amolina.data.model.reppository.DataRestaurantRepository
import com.amolina.domain.repository.RestaurantRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)


    @Provides
    @Singleton
    fun provideRestaurantRepository(apiService: ApiService): RestaurantRepository =
        DataRestaurantRepository(apiService)


}