package org.ventanas.Kotlin
// 6. Sumar números del 1 al 100
// Crear un programa que sume todos los números del 1 al 100.

fun ejercicio6() {
    var cont = 0
    for (i in 1..100){
        val newCont = cont +i
        println("$cont + $i = ${newCont}")
        cont = newCont
    }
}