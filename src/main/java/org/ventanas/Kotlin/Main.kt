package org.ventanas.Kotlin

fun main(){

    var finish = false
    while (!finish){
        println("Elige el ejercicio del 1 al 14 o x para salir.:")
        val ejercicio = readln()
        when(ejercicio){
            "1"-> ejercicio1()
            "2"-> ejercicio2()
            "3"-> ejercicio3()
            "4"-> ejercicio4()
            "5"-> ejercicio5()
            "6"-> ejercicio6()
            "7"-> ejercicio7()
            "8"-> ejercicio8()
            "9"-> ejercicio9()
            "10"-> ejercicio10()
            "11"-> ejercicio11()
            "12"-> ejercicio12()
            "13"-> ejercicio13()
            "14"-> ejercicio14()
            "x"-> finish = true
        }
    }

}