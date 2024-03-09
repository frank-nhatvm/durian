package com.nhatvm.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object DurianTheme {
    val colors: DurianColor
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: DurianTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

@Composable
fun DurianTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    typography: DurianTypography ,
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) darkColor() else lightColor()

    DurianTheme(colors = colors, typography = typography, content = content)
}

@Composable
fun DurianTheme(
    colors: DurianColor = DurianTheme.colors,
    typography: DurianTypography = DurianTheme.typography,
    content: @Composable () -> Unit,
) {

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        content = content
    )

}