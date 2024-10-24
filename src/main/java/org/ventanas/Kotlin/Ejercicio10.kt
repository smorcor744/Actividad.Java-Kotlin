package org.ventanas.Kotlin
// 10. Conversión de temperaturas
// Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
// viceversa. (C = (F- 32) * 5/9, F = C * 9/5 + 32).

fun ejercicio10() {
    println("Que a que quieres comvertir la temperatura (Celsius o Fahrenheit):")
    print("Dame la temperatura en Celsius: ")
    val temp = readln().lowercase()
    try {
        val num = readln().toDouble()
        var result = 0.0
        if (temp =="celsius"){
            result = celsius(num)
        }

        if (temp =="fahrenheit"){
            result =fahrenheit(num)
        }

        println(result)


    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }
}

fun celsius(num:Double): Double {
    val result = num * (9.0/5.0) +32.0

    return result

}
fun fahrenheit(num:Double): Double {
    val result = (num -32) * (5/9)

    return result
}