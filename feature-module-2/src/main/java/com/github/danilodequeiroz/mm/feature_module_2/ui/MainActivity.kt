package com.github.danilodequeiroz.mm.feature_module_2.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.github.danilodequeiroz.mm.feature_module_2.ui.theme.AndroidMultiModuleFeature2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidMultiModuleFeature2Theme {
                GreetingScreen()
            }
        }
    }
}
