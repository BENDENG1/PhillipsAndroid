package com.bendeng.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bendeng.composepractice.component.ImageCard
import com.bendeng.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(10.dp)
                ) {
                    ImageCard(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "내용입니다",
                        title = "제목"
                    )
                }

            }
        }
    }
}

