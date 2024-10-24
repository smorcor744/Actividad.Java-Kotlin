package org.ventanas.Java;
// 3. Cálculo del área de un círculo
// Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
import java.util.Scanner;

public class Ejercicio3 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el radio de tu círculo: ");
        try {
            double num = scanner.nextDouble();
            double area = Math.PI * (num * num);
            System.out.println("El área de tu círculo es de: " + area);
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser un valor numérico.");
        }
    }
}
