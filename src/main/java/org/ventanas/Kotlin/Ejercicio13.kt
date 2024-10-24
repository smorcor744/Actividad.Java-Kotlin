package org.ventanas.Kotlin
// 13. Clase Anime sencilla
// Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
// usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.

data class Anime(val nombre: String, val episodios: Int, val genero: String)

fun ejercicio13() {
    try {
    print("Dame el nombre del anime: ")
    val nombre = readln()

    print("Dame el número de episodios: ")
    val episodios = readln().toInt()

    print("Dame el género del anime: ")
    val genero = readln()

    val anime = Anime(nombre, episodios, genero)
    println("Información del anime:")
    println("Nombre: ${anime.nombre}")
    println("Episodios: ${anime.episodios}")
    println("Género: ${anime.genero}")

    }catch (e:Exception) {
        println(e.message)}
}
