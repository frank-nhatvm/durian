package com.nhatvm.core.network.common

sealed interface DurianNetworkResult<out T> {
    data class Success<T>(val data: T) : DurianNetworkResult<T>
    data class Error(val exception: Throwable) : DurianNetworkResult<Nothing>
}
