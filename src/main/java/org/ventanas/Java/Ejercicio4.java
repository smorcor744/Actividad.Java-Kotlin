package org.ventanas.Java;
// 4. Generador de números aleatorios
// Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
// El programa indicará si el número es mayor o menor al ingresado.
// Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void execute() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int adivina = 0;
        Scanner scanner = new Scanner(System.in);

        while (adivina != num) {
            System.out.println("Adivina el número del 1 al 100: ");
            try {
                adivina = Integer.parseInt(scanner.nextLine());
                if (adivina != num) {
                    System.out.println("Inténtalo de nuevo :( ");
                }
            } catch (Exception e) {
                System.out.println("Error al insertar el número, debe ser entero.");
            }
        }
        System.out.println("¡Felicidades! Has acertado, el número era el " + num);
    }
}
