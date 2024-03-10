package com.nhatvm.splash

import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.fatherofapps.jnav.annotations.JNav
import com.nhatvm.core.designsystem.theme.DurianTheme
import kotlinx.coroutines.delay

@JNav(
    destination = "splash_destination",
    baseRoute = "splash_route",
    name = "SplashNavigation"
)
@Composable
fun SplashRoute(onNavigateToHome: () -> Unit, viewModel: SplashViewModel = hiltViewModel()) {
    val savedNavigateToHome = remember {
        onNavigateToHome
    }

    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(key1 = uiState.isSuccess) {
        if (uiState.isSuccess) {
            savedNavigateToHome()
        }
    }

    val errorMessage by remember(uiState.error) {
        derivedStateOf { uiState.error?.message }
    }

    SplashScreen(errorMessage)
}

@Composable
fun SplashScreen(errorMessage: String? = null) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "durian",
            style = DurianTheme.typography.labelLarge.copy(color = DurianTheme.colors.primary)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LinearProgressIndicator()
        if (null != errorMessage) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(color = DurianTheme.colors.error)
            ) {
                Text(
                    text = errorMessage,
                    style = DurianTheme.typography.displayMedium.copy(color = DurianTheme.colors.onError)
                )
            }
        }
    }
}