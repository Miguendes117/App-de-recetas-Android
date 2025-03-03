package com.example.recetasapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetasapp.R
import com.example.recetasapp.models.Receta

@Composable
fun HomeView(navController: NavController) {
    val recetas = listOf(
        Receta(1, "Receta 1", R.drawable.tacos, listOf("fasdfasd", "Ingrediente 2"), "Preparación 1"),
        Receta(2, "Receta 2", R.drawable.carnederes, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 2"),
        Receta(3, "Receta 3", R.drawable.rajas_poblanas_cremosas_con_pollitol, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 3")

        // Agrega más recetas aquí
    )

    LazyColumn {
        items(recetas) { receta ->
            RecetaItem(receta, navController)
        }
    }
}

@Composable
fun RecetaItem(receta: Receta, navController: NavController) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .clickable { navController.navigate("RecipeDetail/${receta.id}") }
    ) {
        Image(painter = painterResource(id = receta.imagen), contentDescription = null)
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(text = receta.titulo, style = MaterialTheme.typography.titleMedium)
            Text(text = "Ver detalles", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

