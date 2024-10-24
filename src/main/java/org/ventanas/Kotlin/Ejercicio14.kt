package org.ventanas.Kotlin
// 14. Inventario de videojuegos
// Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
// usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
// eliminar y mostrar los videojuegos del inventario.

data class Videojuego(val titulo: String, val plataforma: String, val horasJugadas: Int)

fun ejercicio14() {
    val inventario = mutableListOf<Videojuego>()

    while (true) {
        println("Opciones: [1] Añadir videojuego, [2] Eliminar videojuego, [3] Mostrar inventario, [4] Salir")
        val opcion = readln().toInt()
        try {


        when (opcion) {
            1 -> {
                print("Titulo: ")
                val titulo = readln()
                print("Plataforma: ")
                val plataforma = readln()

                print("Horas jugadas: ")
                val horasJugadas = readln().toInt()

                val videojuego = Videojuego(titulo, plataforma, horasJugadas)
                inventario.add(videojuego)
                println("Videojuego añadido al inventario.\n")
            }
            2 -> {
                print("Indice del videojuego a eliminar: ")
                val indice = readln().toInt()
                if (indice in inventario.indices) {
                    inventario.removeAt(indice)
                    println("Videojuego eliminado del inventario.\n")
                } else {
                    println("Indice no válido.\n")
                }
            }
            3 -> {
                println("Inventario de videojuegos:")
                for ((index, videojuego) in inventario.withIndex()) {
                    println("[$index] Titulo: ${videojuego.titulo}, Plataforma: ${videojuego.plataforma}, Horas jugadas: ${videojuego.horasJugadas}")
                }
                println()
            }
            4 -> return
            else -> println("Opción no válida.\n")
        }
        }catch (e:Exception){
            println(e.message)}
    }
}
