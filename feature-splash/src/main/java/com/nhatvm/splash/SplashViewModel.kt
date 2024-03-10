package com.nhatvm.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nhatvm.core.data.repositories.ConfigRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.scan
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
   private val configRepository: ConfigRepository,
) : ViewModel() {

    val uiState: StateFlow<SplashState>

    init {
        val initialState = SplashState(isLoading = true)
        uiState = combine(storeConfigFlow(), currencyFlow()) { listConfig, currency ->
            Log.e("debug_splash", "$listConfig - $currency")
            SplashPartialState.Success
        }.catch { t ->
            SplashPartialState.Fail(t)
        }.scan(initialState) { currentState, partialState ->
            partialState.reduce(currentState)
        }.stateIn(viewModelScope, SharingStarted.Eagerly, initialState)
    }


    private fun storeConfigFlow() = flow {

        val list = configRepository.getStoreConfig()
        emit(list)
    }

    private fun currencyFlow() = flow {
        val currency = configRepository.getCurrency()
        emit(currency)
    }

}