package com.atomcamp.abbas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.atomcamp.abbas.ui.theme.AbbasFirstApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i("MainActivity", "onCreate()")

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AbbasFirstApplicationTheme {
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
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AbbasFirstApplicationTheme {
        Greeting("Android")
    }
}