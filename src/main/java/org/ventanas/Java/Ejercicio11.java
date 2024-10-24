package org.ventanas.Java;
// 11. Fibonacci
// Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
// número N lo ingresa el usuario).
import java.util.Scanner;

public class Ejercicio11 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            fibonacci(num);
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser entero.");
        }
    }

    public static void fibonacci(int num) {
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
