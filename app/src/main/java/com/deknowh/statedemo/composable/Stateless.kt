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

// stateless
@Composable
fun MyCounter1(
    count1: Int,
    onClick: () -> Int
) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), 
            contentAlignment = Alignment.Center
        ) {
            Column {
                Button(onClick = { onClick() }) {
                    Text(text = "Increase count")
                }
                Text(text = "Count: $count1")
            }

        }
    }
}

@Composable
fun HandleMyState(modifier: Modifier = Modifier) {
    // variable
    var mycount by remember {
        mutableStateOf(0)
    }

    // MyCounter1
    MyCounter1(count1 = mycount, { mycount++})
}