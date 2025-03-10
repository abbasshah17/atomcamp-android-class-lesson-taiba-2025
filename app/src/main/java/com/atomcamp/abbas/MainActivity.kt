package com.atomcamp.abbas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.atomcamp.abbas.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i("MainActivity", "onCreate()")

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Log.i("MainActivity", "Scaffold is being rendered")

                    ListScreen(
                        modifier = Modifier
                            .padding(innerPadding),
                        items = listOf(
                            ProfileExtended.Example1,
                            Profile.Example1,
                            Profile.Example2,
                            Profile.Example3,
                            Profile.Example4,
                            Profile.Example5,
                            Profile.Example6,
                            Profile.Example7,
                            Profile.Example8,
                        )
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

    Log.i("MainActivity", "Greeting is being rendered")

    var counter: Int by remember {
        mutableStateOf(0)
    }

    Column (
        modifier = modifier
            .fillMaxSize(),
    ) {
        Button(onClick = {
            counter = counter + 1
        }) {
            Text("Click me")
        }

        Text(
            text = "${counter}",
            modifier = Modifier
                .clickable {
                    Log.i("Greeting", "The Text Composable has been clicked.")
                },
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}