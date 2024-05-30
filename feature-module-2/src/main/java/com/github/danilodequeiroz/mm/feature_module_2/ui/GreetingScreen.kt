package com.github.danilodequeiroz.mm.feature_module_2.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.github.danilodequeiroz.mm.feature_module_2.ui.theme.AndroidMultiModuleFeature2Theme
import com.github.danilodequeiroz.mm.feature_module_2.ui.theme.Colors


@Composable
internal fun GreetingScreen() {
    Scaffold(
//        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().background(Colors.PurpleGrey40),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }

    }
}

@Composable
private fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        style = TextStyle(background = Colors.Purple40),
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    AndroidMultiModuleFeature2Theme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingScreenPreview() {
    AndroidMultiModuleFeature2Theme {
        GreetingScreen()
    }
}