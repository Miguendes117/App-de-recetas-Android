package com.example.recetasapp.models

data class Receta(
    val id: Int,
    val titulo: String,
    val imagen: Int,
    val ingredientes: List<String>,
    val preparacion: String
)