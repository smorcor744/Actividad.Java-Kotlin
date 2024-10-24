package org.ventanas.Kotlin
//1. Saludo personalizado
// Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
// Juan!".

fun ejercicio1() {
    print("Como te llamas: ")
    val nombre = readln()
    println("¡Hola, $nombre!")
}