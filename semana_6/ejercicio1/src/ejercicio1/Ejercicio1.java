package ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Concierto concierto = new Concierto("SaquenseLaMrd", LocalDate.now(), new Zona[0]);

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar zona");
            System.out.println("2. Eliminar zona");
            System.out.println("3. Mostrar zonas");
            System.out.println("4. Vender entradas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la zona: ");
                    String nombreZona = sc.nextLine();
                    concierto.agregarZona(nombreZona);
                    System.out.println("Zona agregada!");
                    break;

                case 2:
                    System.out.print("Nombre de la zona a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (concierto.eliminarZona(eliminar)) {
                        System.out.println("Zona eliminada!");
                    } else {
                        System.out.println("Zona no encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Zonas actuales:");
                    for (Zona z : concierto.getZonas()) {
                        System.out.println("- " + z.getNombre() + " (capacidad: " + z.getCapacidad() + ")");
                    }
                    break;

                case 4:
                    System.out.print("Nombre de la zona: ");
                    String zonaVenta = sc.nextLine();
                    System.out.print("Cuantas entradas?: ");
                    int num = sc.nextInt();
                    for (Zona z : concierto.getZonas()) {
                        if (z.getNombre().equalsIgnoreCase(zonaVenta)) {
                            Entrada[] vendidas = z.venderEntradas(num);
                            for (Entrada e : vendidas) {
                                if (e != null) System.out.println("Entrada vendida: " + e.getNumero());
                            }
                        }
                    }
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
