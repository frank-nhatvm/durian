package com.nhatvm.core.network.apis

import com.nhatvm.core.network.entities.StoreConfigRemote
import retrofit2.Response
import retrofit2.http.GET

interface StoreConfigsApi {
    @GET("rest/all/V1/store/storeConfigs")
    suspend fun getStoreConfig(): Response<List<StoreConfigRemote>>
}