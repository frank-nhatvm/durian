package com.nhatvm.core.network.datasources

import com.nhatvm.core.network.apis.CurrencyApi
import com.nhatvm.core.network.apis.StoreConfigsApi
import com.nhatvm.core.network.common.DurianNetworkResult
import com.nhatvm.core.network.entities.CurrencyRemote
import com.nhatvm.core.network.entities.StoreConfigRemote
import javax.inject.Inject

interface ConfigRemoteDataSource {

    suspend fun getCurrency(): DurianNetworkResult<CurrencyRemote>

    suspend fun getStoreConfig(): DurianNetworkResult<List<StoreConfigRemote>>
}

class ConfigRemoteDataSourceImpl @Inject constructor(
    private val currencyApi: CurrencyApi,
    private val storeConfigsApi: StoreConfigsApi
) : BaseRemoteDataSource(), ConfigRemoteDataSource {
    override suspend fun getCurrency(): DurianNetworkResult<CurrencyRemote> {
        return callApi {
            currencyApi.getCurrency()
        }
    }

    override suspend fun getStoreConfig(): DurianNetworkResult<List<StoreConfigRemote>> {
        return callApi {
            storeConfigsApi.getStoreConfig()
        }
    }
}