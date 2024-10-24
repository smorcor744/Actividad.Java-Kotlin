package org.ventanas.Java;
// 13. Clase Anime sencilla
// Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
// usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
import java.util.Scanner;

public class Ejercicio13 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Dame el nombre del anime: ");
            String nombre = scanner.nextLine();
            System.out.print("Dame el número de episodios: ");
            int episodios = Integer.parseInt(scanner.nextLine());
            System.out.print("Dame el género del anime: ");
            String genero = scanner.nextLine();

            Anime anime = new Anime(nombre, episodios, genero);
            System.out.println("Información del anime:");
            System.out.println("Nombre: " + anime.getNombre());
            System.out.println("Episodios: " + anime.getEpisodios());
            System.out.println("Género: " + anime.getGenero());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
