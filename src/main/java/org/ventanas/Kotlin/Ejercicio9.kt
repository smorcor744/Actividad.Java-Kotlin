package org.ventanas.Kotlin
//9. Números primos
// Pedir un número al usuario y verificar si es un número primo.

fun ejercicio9() {
    print("Dame un número: ")
    try {
        val num = readln().toInt()

        if (esPrimo(num)){
            println("$num es primo.")
        } else println("$num no es primo.")


    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }
}

fun esPrimo(num:Int): Boolean {
    var primo = num - 1
    var resultado = primo
    for (i in 2..<num){
        primo -= 1
        resultado *= primo

    }
    resultado += 1

    return resultado%num == 0 && num != 1
}