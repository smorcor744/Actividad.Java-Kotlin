package org.ventanas.Java;
// 7. Reverso de una cadena
// Pedir una cadena al usuario e imprimirla al revés.
import java.util.Scanner;

public class Ejercicio7 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        String reversed = new StringBuilder(cadena).reverse().toString();
        System.out.println(reversed);
    }
}
