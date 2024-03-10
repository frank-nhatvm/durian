package com.nhatvm.splash


sealed interface SplashPartialState {
    data object Loading : SplashPartialState

    data object  Success : SplashPartialState

    data class Fail(val error: Throwable?) : SplashPartialState

    fun reduce(currentState: SplashState): SplashState {
        return when (this) {
            is Loading -> currentState.copy(isLoading = true, isSuccess = false, error = null)
            is Success -> currentState.copy(isLoading = false, isSuccess = true)
            is Fail -> currentState.copy(isLoading = false, error = error)
        }
    }
}

data class SplashState(
    val isLoading: Boolean = false,
    val isSuccess: Boolean = false,
    val error: Throwable? = null
)