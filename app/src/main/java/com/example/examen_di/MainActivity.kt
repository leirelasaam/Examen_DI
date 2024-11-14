package com.example.examen_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen_di.ui.theme.Examen_DITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen_DITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(40.dp, 0.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .background(Color.Gray)
                .padding(0.dp, 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = "Hello $name!",
                    modifier = modifier.background(Color.Red)
                )
            }
            Column() {
                for (i in 1..3) {
                    Text(
                        text = "Hello $name!",
                        modifier = modifier.background(Color.Red)
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(40.dp, 0.dp)
                .background(Color.White)
                .fillMaxWidth()
        ) {
            Text(
                text = "Hello $name!",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(

            ) {
                for (i in 1..3) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(100),
                        modifier = Modifier
                            .size(60.dp)
                            .background(Color.Blue)
                    ) {
                        Text(i.toString())
                    }
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(40.dp, 0.dp)
            ) {
                for (i in 4..6) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(100),
                        modifier = Modifier
                            .size(60.dp)
                            .background(Color.Magenta)
                    ) {
                        Text(i.toString())
                    }
                }
            }
            Column(

            ) {
                for (i in 7..9) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(100),
                        modifier = Modifier
                            .size(60.dp)
                            .background(Color.Black)
                    ) {
                        Text(i.toString())
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, widthDp = 400, heightDp = 800)
@Composable
fun GreetingPreview() {
    Examen_DITheme {
        Greeting("Android")
    }
}