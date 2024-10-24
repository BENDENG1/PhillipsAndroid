package com.bendeng.composepractice.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bendeng.composepractice.ui.theme.ComposePracticeTheme
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@Composable
fun ScaffoldSnackbarPractice(
    modifier: Modifier = Modifier
) {
    var textFiledState by remember { mutableStateOf("") }
    val scaffoldState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    ComposePracticeTheme {
        Scaffold(modifier = modifier.fillMaxSize(),
            snackbarHost = { SnackbarHost(hostState = scaffoldState) }) { padding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier.fillMaxSize().padding(horizontal = 30.dp)
            ) {
                TextField(
                    value = textFiledState,
                    label = {
                        Text(("Enter Your Name"))
                    },
                    onValueChange = {
                        textFiledState = it
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                    scope.launch {
                        scaffoldState.showSnackbar("hello $textFiledState")
                    }
                }) {
                    Text("버튼입니당")
                }
            }
        }
    }
}