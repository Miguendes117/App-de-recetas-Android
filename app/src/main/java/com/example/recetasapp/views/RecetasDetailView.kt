package com.example.recetasapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetasapp.R
import com.example.recetasapp.models.Receta

@Composable
fun RecipeDetailView(navController: NavController, recetaId: Int) {
    // Busca la receta correspondiente por ID
    val receta = getRecetaById(recetaId)

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = receta.titulo, style = MaterialTheme.typography.titleMedium)
        Text(text = "Ingredientes", style = MaterialTheme.typography.titleSmall)
        for (ingrediente in receta.ingredientes) {
            Text(text = ingrediente, style = MaterialTheme.typography.bodyMedium)
        }
        Text(text = "Preparación", style = MaterialTheme.typography.titleMedium)
        Text(text = receta.preparacion, style = MaterialTheme.typography.titleMedium)

        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver")
        }
    }
}

// Función para buscar la receta por ID (puedes ajustarla según tu implementación)
fun getRecetaById(id: Int): Receta {
    val recetas = listOf(
        Receta(1, "Receta 1", R.drawable.tacos, listOf("fasdfasd", "Ingrediente 2"), "Preparación 1"),
        Receta(2, "Receta 2", R.drawable.carnederes, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 2"),
        Receta(3, "Receta 3", R.drawable.rajas_poblanas_cremosas_con_pollitol, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 3")
        // Agrega más recetas aquí
    )
    return recetas.first { it.id == id }
}
