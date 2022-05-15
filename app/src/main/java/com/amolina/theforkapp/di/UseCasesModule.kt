package com.amolina.theforkapp.di

import com.amolina.domain.repository.RestaurantRepository
import com.amolina.domain.usecases.GetRestaurantData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @Provides
    @Singleton
    fun provideGetProductUseCase(restaurantRepository: RestaurantRepository) =
        GetRestaurantData(restaurantRepository = restaurantRepository)
}