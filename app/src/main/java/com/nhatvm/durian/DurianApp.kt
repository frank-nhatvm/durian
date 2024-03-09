package com.nhatvm.durian

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost

@Composable
fun DurianApp(
    appState: AppState = rememberAppState()
) {
    Box(modifier = Modifier.fillMaxSize()){
        NavHost(navController = appState.navController, startDestination = ""){

        }
    }
}