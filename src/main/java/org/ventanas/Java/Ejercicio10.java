package org.ventanas.Java;
// 10. Conversión de temperaturas
// Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
// viceversa. (C = (F- 32) * 5/9, F = C * 9/5 + 32).
import java.util.Scanner;

public class Ejercicio10 {

    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿A qué quieres convertir la temperatura (Celsius o Fahrenheit)?");
        String temp = scanner.nextLine().toLowerCase();

        System.out.print("Dame la temperatura en " + temp + ": ");
        try {
            double num = Double.parseDouble(scanner.nextLine());
            double result = 0.0;
            if (temp.equals("celsius")) {
                result = celsius(num);
            } else if (temp.equals("fahrenheit")) {
                result = fahrenheit(num);
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error al insertar el número, debe ser un valor numérico.");
        }
    }

    public static double celsius(double num) {
        return num * (9.0 / 5.0) + 32.0;
    }

    public static double fahrenheit(double num) {
        return (num - 32) * (5.0 / 9.0);
    }
}
