package com.bendeng.composepractice.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListPractice(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
    ) {
        itemsIndexed(
            listOf("t","e","s","t",1,"l","i","s","t")
        ) { _, str ->
            Text(
                text = "$str",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
}