package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non-fictional books based on facts"),
    SCIENCE("Books about scientific topics and discoveries"),
    HISTORY("Books about historical events and figures"),
    CHILDREN("Books written specifically for children");

    fun printDescription() {
        println(description)
    }
}