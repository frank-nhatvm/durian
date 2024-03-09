package com.nhatvm.core.designsystem.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nhatvm.core.designsystem.theme.DurianTheme

@Composable
fun DurianButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled:Boolean = true,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = DurianTheme.colors.onBackground,
        ),
        contentPadding = contentPadding,
        content = content,
    )
}