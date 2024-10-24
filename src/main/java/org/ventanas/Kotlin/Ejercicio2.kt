package org.ventanas.Kotlin
//2. Número par o impar
// Pedir un número al usuario e indicar si es par o impar.


fun ejercicio2() {
    print("Dame un número: ")
    try {
        val num = readln().toInt()
        val resto = num%2
        if (resto == 0){
            println("$num es par.")
        } else println("$num es impar.")


    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }



}