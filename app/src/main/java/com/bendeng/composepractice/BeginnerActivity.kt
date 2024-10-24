package com.bendeng.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bendeng.composepractice.ui.theme.ComposePracticeTheme

class BeginnerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                var name by remember { mutableStateOf("") }
                var names by remember { mutableStateOf(emptyList<String>()) }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    NameSearchBar(
                        name = name,
                        onButtonClick = {
                            if (name.isNotBlank()) {
                                names = names + name
                                name = ""
                            }
                        },
                        onNameChange = {
                            name = it
                        }
                    )

                    NameList(names = names)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameSearchBar(
    modifier: Modifier = Modifier,
    name: String,
    onNameChange: (String) -> Unit,
    onButtonClick: () -> Unit,
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { text ->
                onNameChange(text)
            },
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Button(onClick = {
            onButtonClick()
        }) {
            Text(text = "Add")
        }
    }
}


@Composable
fun NameList(
    names: List<String>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier
    ) {
        items(names) { currentName ->
            Text(
                text = currentName,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Divider()
        }
    }

}