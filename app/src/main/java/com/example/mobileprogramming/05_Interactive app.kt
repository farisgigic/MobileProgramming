package com.example.mobileprogramming

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun LogInModified(){
    LogIn1()
}
@Composable
fun LogIn1(modifier : Modifier = Modifier){
    val text = "Jetpack Compose tutorial\n" +
            "\n" +
            "\n" +
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.\n" +
            "\n" +

            "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.\n"
  Column(
      modifier = Modifier
          .fillMaxSize()
          .wrapContentSize(Alignment.TopCenter)
          .verticalScroll(
              rememberScrollState()
          ),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Top)
  {

      Image(
          painter = painterResource(id = R.drawable.wallpaper),
          contentDescription = "1")
      Spacer(modifier = Modifier.height(10.dp))
      Text(text = text,
          fontSize = 16.sp,
          fontFamily = FontFamily.SansSerif)
      Button(onClick = { /*TODO*/ }) {
          Text(text = "Show more")
      }
      Button(onClick = { /*TODO*/ }) {
          Text(text = "Subscribe")
      }


  }
}


