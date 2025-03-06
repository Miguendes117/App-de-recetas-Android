package com.example.recetasapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.recetasapp.views.HomeView
import com.example.recetasapp.views.RecipeDetailView

@Composable
fun NavManager(modifier: Modifier = Modifier)
{
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home", modifier = modifier) {
        composable("Home") { HomeView(navController) }
        composable(
            "RecipeDetail/{recetaId}",
            arguments = listOf(navArgument("recetaId") { type = NavType.IntType })
        )
        { backStackEntry ->
            val recetaId = backStackEntry.arguments?.getInt("recetaId") ?: return@composable
            RecipeDetailView(navController, recetaId)
        }
    }
}



