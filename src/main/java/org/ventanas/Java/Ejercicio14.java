package org.ventanas.Java;
// 14. Inventario de videojuegos
// Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
// usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
// eliminar y mostrar los videojuegos del inventario.
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    private static final ArrayList<Videojuego> inventario = new ArrayList<>();

    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones: [1] Añadir videojuego, [2] Eliminar videojuego, [3] Mostrar inventario, [4] Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Titulo: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Plataforma: ");
                        String plataforma = scanner.nextLine();
                        System.out.print("Horas jugadas: ");
                        int horasJugadas = scanner.nextInt();
                        Videojuego videojuego = new Videojuego(titulo, plataforma, horasJugadas);
                        inventario.add(videojuego);
                        System.out.println("Videojuego añadido al inventario.\n");
                        break;
                    case 2:
                        System.out.print("Indice del videojuego a eliminar: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < inventario.size()) {
                            inventario.remove(indice);
                            System.out.println("Videojuego eliminado del inventario.\n");
                        } else {
                            System.out.println("Indice no válido.\n");
                        }
                        break;
                    case 3:
                        System.out.println("Inventario de videojuegos:");
                        for (int i = 0; i < inventario.size(); i++) {
                            Videojuego vj = inventario.get(i);
                            System.out.println("[" + i + "] Titulo: " + vj.getTitulo() + ", Plataforma: " + vj.getPlataforma() + ", Horas jugadas: " + vj.getHorasJugadas());
                        }
                        System.out.println();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opción no válida.\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
