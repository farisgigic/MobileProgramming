package com.example.mobileprogramming

import android.inputmethodservice.Keyboard
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileprogramming.ui.theme.MobileProgrammingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileProgrammingTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    //Greeting("Android")
                    println()
                    MessageCard(name = com.example.mobileprogramming.Message("Faris","Hello there"))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        //modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MobileProgrammingTheme {
        Greeting("FARIS")
    }
}
data class Message(val author: String, val body : String)
@Composable
fun MessageCard(name : com.example.mobileprogramming.Message){

    Column {
        Text(text = name.author)
        Text(text = name.body)
    }
}
@Preview
@Composable
fun MessageCardPreview(){
    MessageCard(name = com.example.mobileprogramming.Message("Faris","Hello there"))
}