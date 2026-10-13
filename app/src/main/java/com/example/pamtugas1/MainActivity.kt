package com.example.pamtugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CounterApp()
        }
    }
}

@Composable
fun CounterApp(
    viewModel: CounterViewModel = viewModel()
) {

    val counter by viewModel.counter.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Counter App")

        Spacer(modifier = Modifier.height(24.dp))

        Text("NIM: 245150401111003")

        Text("Nama: Naufal Zahdan Zulfakar")

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = counter.toString()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Button(
                onClick = {
                    viewModel.decrement()
                }
            ) {
                Text("Down")
            }

            Button(
                onClick = {
                    viewModel.reset()
                }
            ) {
                Text("Reset")
            }

            Button(
                onClick = {
                    viewModel.increment()
                }
            ) {
                Text("Up")
            }
        }
    }
}