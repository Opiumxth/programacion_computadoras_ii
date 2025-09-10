package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de trabajadores en la empresa: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Trabajador[] trabajadores;
        trabajadores = new Trabajador[n];
        
        for(int i = 0; i < n; i++){
            trabajadores[i] = new Trabajador();
            System.out.println("====TRABAJADOR ["+ (i+1)+"]===");
            trabajadores[i].ingresarDatos();
        }
        
        System.out.println("\n=== REPORTE ===");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                "Código", "Nombre", "Horas", "Cargo", "Sueldo");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < n; i++){
            trabajadores[i].mostrarDatos();
        }

    }
    
}
