package com.example.mobileprogramming

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginPage(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(  painter = painterResource(id = R.drawable.person),
                contentDescription = "",
                modifier = Modifier.size(width = 90.dp, height = 100.dp)
            )
        Spacer(modifier = Modifier.size(width = 0.dp, height = 0.dp))
        Text(text = "Login",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black
            )
        Spacer(modifier  = Modifier.size(width = 0.dp, height = 10.dp))
        TextField(
            value ="",
            onValueChange ={},
            enabled = true,
            label = {
                Text(text = "Email")
            },
            placeholder = {
                Text(text = "example@email.com")
            },
            isError = false,
            )
        Spacer(modifier = Modifier.size(width = 0.dp, height = 10.dp))
        TextField(
            value ="" ,
            onValueChange = {},
            enabled = true,
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "*******")
            },
            isError = false)
        Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
            ) {

                Text(text = "Login",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 0.dp),
                    color = Color.Black
                    )
            }



    }
}