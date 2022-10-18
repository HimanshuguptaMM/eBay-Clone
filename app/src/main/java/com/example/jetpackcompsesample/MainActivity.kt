package com.example.jetpackcompsesample


import android.graphics.drawable.Icon
import android.os.Bundle
import android.view.Menu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompsesample.ui.theme.JetPackCompseSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JetPackCompseSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MaterialUIApp()
                    SearchItem()
                    CardOne()
                    CardTwo()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackCompseSampleTheme {
        Greeting("Android")
    }
}

@Composable
fun MaterialUIApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Magenta
            )
            {
                Text("eBay")
            }

        }
    ) {

    }
}

@Composable
fun SearchItem() {
    Icon(
        Icons.Filled.Menu,
        contentDescription = "Menu",
        modifier = Modifier.size(50.dp),
        tint = Color.Red
    )

}

@Composable

fun CardOne() {
    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.Blue,
        border = BorderStroke(5.dp, Color.Yellow),
        contentColor = Color.White,
    )
    {
        Column(modifier = Modifier.height(100.dp)) {
            Text(
                text = "Headphones",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
            )

        }
    }
}
@Composable
fun CardTwo() {
    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.Blue,
        border = BorderStroke(5.dp, Color.Yellow),
        contentColor = Color.White,
    ) {
        Column(modifier = Modifier.height(100.dp)) {
            Text(
                text = "Laptops",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
            )

        }
    }
}





