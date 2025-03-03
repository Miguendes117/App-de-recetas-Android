package com.example.recetasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recetasapp.navigation.NavManager
import com.example.recetasapp.ui.theme.RecetasAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecetasAppTheme {
                AppScaffold()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Recetas") }
            )
        },
        content = { innerPadding ->
            NavManager(modifier = Modifier.padding(innerPadding))
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecetasAppTheme {
        AppScaffold()
    }
}

