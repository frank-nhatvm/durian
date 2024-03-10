package com.nhatvm.core.network.apis

import com.nhatvm.core.network.entities.CurrencyRemote
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {

    @GET("rest/all/V1/directory/currency")
    suspend fun getCurrency(): Response<CurrencyRemote>


}