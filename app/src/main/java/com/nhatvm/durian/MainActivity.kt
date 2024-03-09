package com.nhatvm.durian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nhatvm.core.designsystem.theme.DurianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DurianTheme {
                // A surface container using the 'background' color from the theme
               DurianApp()
            }
        }
    }
}
