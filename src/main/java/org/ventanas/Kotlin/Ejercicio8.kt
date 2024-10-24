package org.ventanas.Kotlin
// 8. Contador de vocales
// Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.

fun ejercicio8() {
    print("Inserte una cadena de caracteres: ")
    val cadena = readln().split("")
    var cont = 0
    cadena.forEach {
        val lower = it.lowercase()
        if (lower == "a"|| lower == "e"|| lower=="i"||lower=="o"||lower =="u") cont++
    }
    println("Contiene $cont vocales.")

}