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
        Receta(1, "Tacos de Salpicon", R.drawable.tacos, listOf("Ingredientes", "Seleccionar todos los ingredientes\n" +
                "1 kilo de falda de res\n" +
                "1/2 cebollas\n" +
                "4 dientes de ajo\n" +
                "3 hojas de laurel\n" +
                "3 jitomates, cortado en cuadritos y sin semillas\n" +
                "1/2 cebollas moradas, cortada finamente\n" +
                "6 rábanos, cortado en cuadritos\n" +
                "3 chiles serranos, finamente picado, sin semillas\n" +
                "3 cucharadas de cilantro fresco\n" +
                "1/4 lechugas orejonas, cortada en tiritas\n" +
                "1/4 tazas de jugo de limón\n" +
                "3 cucharadas de vinagre blanco\n" +
                "1 pizca de sal\n" +
                "tostadas al gusto, para acompañar\n" +
                "aguacate al gusto, para acompañar\n" +
                "1 pizca de orégano"), " \n Calienta una olla exprés con agua a fuego medio, cocina la carne de res, la cebolla, el ajo, las hojas de laurel por aproximadamente 1 hora. Enfría.\n" +
                "Con ayuda de unos tenedores deshebra la carne.\n" +
                "En un bowl agrega la carne, el jitomate, la cebolla morada, los rábanos, el chile serrano, el cilantro y la lechuga orejona.\n" +
                "Sazona con jugo de limón vinagre blanco, orégano y sal a tu gusto. Sirve sobre tostadas y acompaña con aguacate y orégano."),

        Receta(2, "Receta 2", R.drawable.carnederes, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 2"),
        Receta(3, "Receta 3", R.drawable.rajas_poblanas_cremosas_con_pollitol, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 3"),
        Receta(4, "Receta 4", R.drawable.picadilloalamiguendesz, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 4")

        // Agrega más recetas aquí
    )
    return recetas.first { it.id == id }
}
