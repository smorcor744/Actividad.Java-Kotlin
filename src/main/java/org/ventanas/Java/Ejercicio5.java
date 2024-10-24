package org.ventanas.Java;
// 5. Tabla de multiplicar
// Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
import java.util.Scanner;

public class Ejercicio5 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número: ");
        try {
            int num = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + num + " = " + (i * num));
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser entero.");
        }
    }
}
