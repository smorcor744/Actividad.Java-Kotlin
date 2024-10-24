package org.ventanas.Java;
//1. Saludo personalizado
// Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
// Juan!".
import java.util.Scanner;

public class Ejercicio1 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Como te llamas: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}