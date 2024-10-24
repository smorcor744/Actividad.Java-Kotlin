package org.ventanas.Java;
//9. Números primos
// Pedir un número al usuario y verificar si es un número primo.
import java.util.Scanner;

public class Ejercicio9 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (esPrimo(num)) {
                System.out.println(num + " es primo.");
            } else {
                System.out.println(num + " no es primo.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser entero.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}