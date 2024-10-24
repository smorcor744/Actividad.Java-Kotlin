package org.ventanas.Kotlin
// 11. Fibonacci
// Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
// número N lo ingresa el usuario).

fun ejercicio11() {
    print("Dame un número entero: ")
    try {
        val num = readln().toInt()

        fibonacci(num)

    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }
}

fun fibonacci(num : Int) {
    var t1 = 0
    var t2 = 1
    for (i in 1..num) {
        println(t1)
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}
