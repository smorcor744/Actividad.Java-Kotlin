package org.ventanas.Kotlin
// 7. Reverso de una cadena
// Pedir una cadena al usuario e imprimirla al revés.

fun ejercicio7() {
    print("Inserte una cadena de caracteres: ")
    val cadena = readln().split("").reversed()
    cadena.forEach{
        print(it)
    }
    println()


}