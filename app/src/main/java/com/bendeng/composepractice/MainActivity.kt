package com.bendeng.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.bendeng.composepractice.practice.RecompositionExample
import com.bendeng.composepractice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposePracticeTheme {
                RecompositionExample()
            }
        }
    }
}
