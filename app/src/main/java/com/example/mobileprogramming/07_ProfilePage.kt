package com.example.mobileprogramming

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen (){
    var name = "Faris"
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    ) {
        Row {
            TextField(
                value = name,
                onValueChange = {},
                label = {
                    Text(text = "name")
                },
                isError = false,
                readOnly = true,
                modifier = Modifier.width(135.dp)

                )
            Spacer(modifier = Modifier.size(height = 0.dp, width = 5.dp))
            TextField(
                value = name,
                onValueChange = {},
                label = {
                    Text(text = "name")
                },
                isError = false,
                readOnly = true,
                modifier = Modifier.width(135.dp)

            )

        }

    }







}