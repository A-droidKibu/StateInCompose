package com.deknowh.statedemo.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * This is a stateful demo
 */

@Composable
fun Counter(modifier: Modifier = Modifier) {
    // variable to store data
    var count by remember {
        mutableStateOf(0)
    }

    // Box and column
    Column {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp), contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {
                    count ++
                }
            ) {
                Text(text = "Increase count")
                Text("Count: $count")
            }
        }
    }
}