package org.ventanas.Java;
// 2. Número par o impar
// Pedir un número al usuario e indicar si es par o impar.
import java.util.Scanner;

public class Ejercicio2 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número: ");
        try {
            int num = scanner.nextInt();
            int resto = num % 2;
            if (resto == 0) {
                System.out.println(num + " es par.");
            } else {
                System.out.println(num + " es impar.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser entero.");
        }
    }
}
