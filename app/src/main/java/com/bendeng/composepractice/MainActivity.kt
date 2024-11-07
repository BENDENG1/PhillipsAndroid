package com.bendeng.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bendeng.composepractice.component.DropDown3D
import com.bendeng.composepractice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposePracticeTheme {
                Surface(
                    color = Color(0xFF101010),
                    modifier = Modifier.fillMaxSize()
                ) {
                    DropDown3D(
                        text = "hello",
                        modifier = Modifier.padding(16.dp),
                        initiallyOpened = true,
                    ) {
                        Text(text = "this is now revealed!",
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(100.dp)
                                .background(Color.Green))
                    }

                }
            }
        }
    }
}
