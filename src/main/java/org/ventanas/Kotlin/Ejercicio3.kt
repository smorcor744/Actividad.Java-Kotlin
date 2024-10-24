package org.ventanas.Kotlin
// 3. Cálculo del área de un círculo
// Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).

fun ejercicio3() {
    print("Dame el radio de tu circulo: ")
    try {
        val num = readln().toDouble()
        val area = kotlin.math.PI *(num * num)
        println("El area de tu circulo es de: $area")



    }catch (e:Exception){
        println("Error al insertar el numero, debe de ser entero.")
    }


}