package com.example.recetasapp.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
                "1 pizca de orégano"), "\nPreparación\n" +
                "Calienta una olla exprés con agua a fuego medio, cocina la carne de res, la cebolla, el ajo, las hojas de laurel por aproximadamente 1 hora. Enfría.\n" +
                "Con ayuda de unos tenedores deshebra la carne.\n" +
                "En un bowl agrega la carne, el jitomate, la cebolla morada, los rábanos, el chile serrano, el cilantro y la lechuga orejona.\n" +
                "Sazona con jugo de limón vinagre blanco, orégano y sal a tu gusto. Sirve sobre tostadas y acompaña con aguacate y orégano."),

        Receta(2, "Carne de Res a la Mexicana", R.drawable.carnederes, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 2"),
        Receta(3, "Rajas Poblanas cremosas", R.drawable.rajas_poblanas_cremosas_con_pollitol, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 3") ,
        Receta(4, "Picadillo a la Mexicana", R.drawable.picadilloalamiguendesz, listOf("Ingrediente 1", "Ingrediente 2"), "Preparación 4"),

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
        Image(
            painter = painterResource(id = receta.imagen),
            contentDescription = null,
            modifier = Modifier.size(150.dp) // Ajustar el tamaño de la imagen
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(text = receta.titulo, style = MaterialTheme.typography.titleMedium)
            Text(text = "Ver detalles", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

