package com.atomcamp.abbas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.atomcamp.abbas.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i("MainActivity", "onCreate()")

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Abbas",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.i("MainActivity", "onResume()")
    }

    override fun onStop() {
        super.onStop()

        Log.i("MainActivity", "onStop()")
    }

    override fun onPause() {
        super.onPause()

        Log.i("MainActivity", "onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("MainActivity", "onDestroy()")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End,
    ) {
        Text(
            text = "Hello this is your Trainer $name!",
            modifier = Modifier
                .clickable {
                    Log.i("Greeting", "The Text Composable has been clicked.")
                },
        )

        Text(
            text = "Hello this is your Trainer $name!",
            modifier = Modifier
                .clickable {
                    Log.i("Greeting", "The Text Composable has been clicked.")
                },
        )

        Text(
            text = "Hello this is your Trainer $name!",
            modifier = Modifier
                .clickable {
                    Log.i("Greeting", "The Text Composable has been clicked.")
                },
        )

        Button(onClick = {

        }) {
            Text(
                text = "Hello this is your Trainer $name!",
                modifier = Modifier
                    .background(color = Color.Blue)
                    .fillMaxWidth(),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}