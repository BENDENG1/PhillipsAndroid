package com.bendeng.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bendeng.composepractice.ui.theme.PhillipsJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhillipsJetPackTheme {

            }
        }
    }
}

