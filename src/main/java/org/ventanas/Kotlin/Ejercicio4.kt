package org.ventanas.Kotlin

import kotlin.random.Random

//4. Generador de números aleatorios
// Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
// El programa indicará si el número es mayor o menor al ingresado.
// Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.

fun  ejercicio4() {
    val num = Random.nextInt(1,100)
    var adivina: Int = 0
    while (adivina != num){
        println("Adivina el número del 1 al 100: ")

        try {
            adivina = readln().toInt()
            if (adivina != num){
                println("Intentalo de nuevo :( ")
            }
        }catch (e:Exception){
            println("Error al insertar el numero, debe de ser entero.")
        }

    }
    println("Felicidades has acertado, el numero era el $num")

}