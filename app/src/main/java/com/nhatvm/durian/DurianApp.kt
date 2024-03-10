package com.nhatvm.durian

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fatherofapps.jnav.annotations.JNav
import com.nhatvm.core.designsystem.theme.DurianTheme


@Composable
fun DurianApp(
    appState: AppState = rememberAppState()
) {
    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = appState.navController, startDestination = TestNavigation.route) {
            composable(route = TestNavigation.route) {
                TestScreen()
            }
        }
    }
}

@JNav(
    name = "TestNavigation",
    baseRoute = "test_route",
    destination = "test_destination"
)
@Composable
fun TestScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DurianTheme.colors.background),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "durian",
            style = DurianTheme.typography.labelLarge.copy(color = DurianTheme.colors.primary)
        )
    }
}