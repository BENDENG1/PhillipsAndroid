package com.bendeng.composepractice.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.layoutId

@Composable
fun ConstraintLayoutPractice(
    modifier : Modifier = Modifier
) {
    val constraints = ConstraintSet {
        val greenBox = createRefFor("greenbox")
        val redBox = createRefFor("redbox")
        val guildLine = createGuidelineFromTop(20.dp)

        constrain(greenBox) {
            top.linkTo(guildLine)
            start.linkTo(parent.start)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }
        constrain(redBox){
            top.linkTo(greenBox.top)
            start.linkTo(greenBox.end)
            bottom.linkTo(greenBox.bottom)
            //width = Dimension.fillToConstraints
            width = Dimension.value(50.dp)
            height = Dimension.value(50.dp)
        }
        createHorizontalChain(greenBox, redBox)
    }
    ConstraintLayout(constraints, modifier = modifier.fillMaxSize()) {
        Box(modifier = modifier
            .background(Color.Green)
            .layoutId("greenbox")
        )
        Box(modifier = modifier
            .background(Color.Red)
            .layoutId("redbox")
        )
    }
}
