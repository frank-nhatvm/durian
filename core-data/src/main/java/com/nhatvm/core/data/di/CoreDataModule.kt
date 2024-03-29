package com.nhatvm.core.data.di

import com.nhatvm.core.data.repositories.ConfigRepository
import com.nhatvm.core.network.datasources.ConfigRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CoreDataModule {

    @Provides
    fun provideConfigRepository(configRemoteDataSourceImpl: ConfigRemoteDataSourceImpl): ConfigRepository

}