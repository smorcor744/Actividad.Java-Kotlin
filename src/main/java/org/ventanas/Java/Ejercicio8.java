package org.ventanas.Java;
// 8. Contador de vocales
// Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
import java.util.Scanner;

public class Ejercicio8 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        int cont = 0;

        for (char c : cadena.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                cont++;
            }
        }

        System.out.println("Contiene " + cont + " vocales.");
    }
}
