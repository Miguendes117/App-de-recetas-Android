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
                "Paso 1: Calienta una olla exprés con agua a fuego medio, cocina la carne de res, la cebolla, el ajo, las hojas de laurel por aproximadamente 1 hora. \n Paso 2: Enfría" +
                "Con ayuda de unos tenedores deshebra la carne.\n" +
                "Paso 3: En un bowl agrega la carne, el jitomate, la cebolla morada, los rábanos, el chile serrano, el cilantro y la lechuga orejona.\n" +
                "Paso 4: Sazona con jugo de limón vinagre blanco, orégano y sal a tu gusto. Sirve sobre tostadas y acompaña con aguacate y orégano."),

        Receta(2, "Carne Molida de Res a la Mexicana", R.drawable.carnederes, listOf("Ingredientes:\n", "Seleccionar todos los ingredientes\n" +
                "1/4 cebollas, asada para la salsa\n" +
                "1 diente de ajo, asado para la salsa\n" +
                "2 jitomates, asados para la salsa\n" +
                "5 chiles morita, sin semillas y remojados para la salsa\n" +
                "1/2 tazas de caldo de res, para la salsa\n" +
                "2 cucharadas de aceite vegetal, para la carne a la mexicana\n" +
                "1/4 cebollas, finamente picada para la carne a la mexicana\n" +
                "1 diente de ajo, finamente picado para la carne a la mexicana\n" +
                "2 tazas de carne molida de res, para la carne a la mexicana\n" +
                "4 jitomates, en cubos para la carne a la mexicana\n" +
                "2 chile cuaresmeño, finamente picado para la carne a la mexicana\n" +
                "pimienta al gusto, para la carne a la mexicana\n" +
                "sal al gusto, para la carne a la mexicana\n" +
                "1/4 tazas de epazote, finamente picado para la carne a la mexicana\n" +
                "1 taza de nopal, en tiras y cocidos para la carne a la mexicana\n" +
                "suficiente de epazote, hojas para decorar\n" +
                "suficiente de tortilla, para acompañar\n" +
                "suficiente de frijol, para acompañar\n"), "\nPaso 1: Para la salsa, licúa la cebolla, el ajo, los jitomates, el chile morita y el caldo de res hasta que se mezclen por completo. \nPaso 2: Reserva" +
                "En una cacerola con aceite, acitrona la cebolla y el ajo hasta que comiencen a cambiar de color. \n Paso 3:Agrega la carne de res, el jitomate y el chile cuaresmeño. Sazona con sal y pimienta. \nPaso4: Vierte la salsa con ayuda de un colador y mueve hasta incorporar. Agrega el epazote y los nopales; cocina por 8 minutos más a fuego medio.\n" +
                "Paso 5:Sirve en un plato extendido, decora con hojas de epazote. Acompaña con tortilla de maíz y frijoles enteros."),

        Receta(3, "Rajas Poblanas Cremosas con Pollo", R.drawable.rajas_poblanas_cremosas_con_pollitol, listOf("Ingredientes:\n", "8 chiles poblanos\n" +
                "2 cucharadas de aceite\n" +
                "1/2 cebollas, fileteada\n" +
                "1 diente de ajo\n" +
                "2 pechugas de pollo, cortada en fajitas\n" +
                "sal y pimienta al gusto\n" +
                "1 taza de grano de elote\n" +
                "1 taza de crema ácida\n" +
                "1 1/2 tazas de queso manchego, rallado\n"), "\nPaso 1:Asa los chiles poblanos en un comal a fuego alto, hasta quemar por completo. \nPaso 2:Colócalos en una bolsa de plástico, cierra y deja sudar alrededor de 20 minutos.\n" +
                "Paso 3: Una vez que los chiles hayan sudado, con ayuda de un cuchillo, retira la piel, desvena y quita las semillas. \nPaso 4:Corta en finas tiras y reserva.\n" +
                "Paso 5:Calienta una sartén a fuego medio con el aceite y cocina la cebolla y el ajo. \nPaso 6:Agrega las fajitas de pollo y cocina hasta dorar, sazona con sal y pimienta.\n" +
                "Paso 6:Agrega las rajas, los granos de elote y cocina 5 minutos. Añade la crema ácida y el queso y deja que se funda. Sazona con sal y pimienta.\n" +
                "Paso 7: Sirve sobre tortillas de harina o acompañado de arroz blanco."),

        Receta(4, "Picadillo a la Mexicana Casero", R.drawable.picadilloalamiguendesz, listOf("Ingredientes:\n", "\n6 jitomates, en cuartos, para la salsa\n" +
                "1 diente de ajo, para la salsa\n" +
                "1/4 cebollas, para la salsa\n" +
                "3 cucharadas de aceite\n" +
                "1/2 cebollas, finamente picada\n" +
                "600 gramos de carne molida de res\n" +
                "1/4 tazas de puré de tomate, opcional\n" +
                "3 papas, peladas y en cubos\n" +
                "2 chiles serranos, picado finamente\n" +
                "2 zanahorias, peladas y en cubos\n" +
                "1/2 tazas de chícharo\n" +
                "1/2 cucharaditas de orégano\n" +
                "1/2 cucharaditas de comino molido\n" +
                "1 hoja de laurel\n" +
                "1 cucharadita de sal\n" +
                "1/2 cucharaditas de pimienta\n" +
                "suficiente de arroz, para acompañar\n" +
                "suficiente de tortilla, para acompañar\n" +
                "suficiente de frijol, para acompañar\n"), "\nPaso 1:Licúar los jitomates, el ajo y cebolla. \nPaso 2:Reserva.\n" +
                "En un sartén a fuego alto, calienta el aceite y cocina la cebolla, luego agrega la carne y cocina por 7 minutos o hasta que cambie de color. Paso 3:Añade el puré de tomate y cocina dos minutos más.\n" +
                "Paso 4:Añade las verduras y cocina por dos minutos. Agrega la salsa y las especias, deja que suelte el hervor y cocina a fuego bajo por 20 minutos o hasta que se haya reducido el líquido.\n" +
                "Paso 5: Sazona y sirve.")
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
            modifier = Modifier.size(140.dp) // Ajustar el tamaño de la imagen
        )
        Column(modifier = Modifier.padding(start = 8.dp)) {
            Text(text = receta.titulo, style = MaterialTheme.typography.titleMedium)
            Text(text = "Ver detalles", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

