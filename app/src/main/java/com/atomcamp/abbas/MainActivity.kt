package com.atomcamp.abbas

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
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

//        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val userNameField: EditText = findViewById(R.id.userNameField)

        userNameField.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    p0: CharSequence?,
                    p1: Int,
                    p2: Int,
                    p3: Int,
                ) {
                }

                override fun onTextChanged(
                    p0: CharSequence?,
                    p1: Int,
                    p2: Int,
                    p3: Int
                ) {
                    Log.i("MainActivity", "p0 = $p0, p1 = $p1, p2 = $p2, p3 = $p3.")
                }

                override fun afterTextChanged(
                    p0: Editable?,
                ) {
                    if (p0?.isEmpty() == true) {

                    } else if ((p0?.length ?: 0) <= 8) {
                        userNameField.error = "Minimum length should be 8 characters."
                    }
                }
            }
        )
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