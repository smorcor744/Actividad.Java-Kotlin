package org.ventanas.Kotlin
// 12. Inversión de un número
// Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
// Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.

fun ejercicio12() {
    print("Dame un número entero: ")
    try {
        val num = readln().toInt()
        val final = num.toString().reversed()
        println(final)

    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }
}

