package org.ventanas.Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while (!finish) {
            System.out.println("Elige el ejercicio del 1 al 14 o x para salir.:");
            String ejercicio = scanner.nextLine();
            switch (ejercicio) {
                case "1":
                    Ejercicio1.execute();
                    break;
                case "2":
                    Ejercicio2.execute();
                    break;
                case "3":
                    Ejercicio3.execute();
                    break;
                case "4":
                    Ejercicio4.execute();
                    break;
                case "5":
                    Ejercicio5.execute();
                    break;
                case "6":
                    Ejercicio6.execute();
                    break;
                case "7":
                    Ejercicio7.execute();
                    break;
                case "8":
                    Ejercicio8.execute();
                    break;
                case "9":
                    Ejercicio9.execute();
                    break;
                case "10":
                    Ejercicio10.execute();
                    break;
                case "11":
                    Ejercicio11.execute();
                    break;
                case "12":
                    Ejercicio12.execute();
                    break;
                case "13":
                    Ejercicio13.execute();
                    break;
                case "14":
                    Ejercicio14.execute();
                    break;
                case "x":
                    finish = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
