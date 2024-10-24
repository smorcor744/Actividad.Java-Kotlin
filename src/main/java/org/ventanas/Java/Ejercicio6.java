package org.ventanas.Java;
// 6. Sumar números del 1 al 100
// Crear un programa que sume todos los números del 1 al 100.
public class Ejercicio6 {
    public static void execute() {
        int cont = 0;
        for (int i = 1; i <= 100; i++) {
            int newCont = cont + i;
            System.out.println(cont + " + " + i + " = " + newCont);
            cont = newCont;
        }
    }
}
