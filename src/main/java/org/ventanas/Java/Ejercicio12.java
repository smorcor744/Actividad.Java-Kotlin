package org.ventanas.Java;
// 12. Inversión de un número
// Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
// Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
import java.util.Scanner;

public class Ejercicio12 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número entero: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            String reversed = new StringBuilder(Integer.toString(num)).reverse().toString();
            System.out.println(reversed);
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser entero.");
        }
    }
}
