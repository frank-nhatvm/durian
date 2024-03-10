package com.nhatvm.splash.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.nhatvm.splash.SplashNavigation
import com.nhatvm.splash.SplashRoute

fun NavGraphBuilder.splashScreen(onNavigateToHome: () -> Unit) {
    composable(route = SplashNavigation.route) {
        SplashRoute(onNavigateToHome = onNavigateToHome)
    }
}