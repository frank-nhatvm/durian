package com.nhatvm.core.data.repositories

import com.nhatvm.core.common.IoDispatcher
import com.nhatvm.core.data.mappers.toModel
import com.nhatvm.core.model.Currency
import com.nhatvm.core.model.StoreConfig
import com.nhatvm.core.network.common.DurianNetworkResult
import com.nhatvm.core.network.datasources.ConfigRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface ConfigRepository {

    suspend fun getCurrency(): Currency

    suspend fun getStoreConfig(): List<StoreConfig>

}

class ConfigRepositoryImpl @Inject constructor(
    private val configRemoteDataSource: ConfigRemoteDataSource,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : ConfigRepository {
    override suspend fun getCurrency(): Currency = withContext(dispatcher) {
        when (val result = configRemoteDataSource.getCurrency()) {
            is DurianNetworkResult.Success -> {
                result.data.toModel()
            }

            is DurianNetworkResult.Error -> throw result.exception
        }
    }

    override suspend fun getStoreConfig(): List<StoreConfig> = withContext(dispatcher) {
        when (val result = configRemoteDataSource.getStoreConfig()) {
            is DurianNetworkResult.Success -> {
                result.data.map { it.toModel() }
            }

            is DurianNetworkResult.Error -> throw result.exception

        }
    }
}
