package com.nhatvm.core.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class AccessTokenInterceptor(private val accessToken: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest =
            request.newBuilder().addHeader("Authorization", "Bearer $accessToken").build()

        return chain.proceed(newRequest)
    }
}