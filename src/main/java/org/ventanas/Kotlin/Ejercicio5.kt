package org.ventanas.Kotlin
//5. Tabla de multiplicar
// Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.

fun  ejercicio5() {
    print("Dame un número: ")
    try {
        val num = readln().toInt()

        for (i in 1..10){
            println("$i x $num = ${i*num}")
        }

    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }



}