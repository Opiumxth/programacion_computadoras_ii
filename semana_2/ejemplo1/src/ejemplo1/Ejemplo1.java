package ejemplo1;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sumaNotas = 0;
        
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        // Definiendo el arreglo de alumnos
        Alumno[] alumnos;
        alumnos = new Alumno[n];
        
        // Instanciando cada alumno e ingresando datos
        for(int i = 0; i < n; i++){
            System.out.println("ALUMNO ["+(i+1)+"]:");
            alumnos[i] = new Alumno();
            alumnos[i].ingresarDatos();
        }
        
        // Mostrando los datos
        System.out.println("\n+~~~ALUMNOS~~~+");
        System.out.printf("%-10s %-15s %-5s\n", "Codigo","Nombre","Nota");
        
        for(int i = 0; i < n; i++){
            alumnos[i].mostrarDatos();
            System.out.println(" ");
            
            // Calculando la suma de notas
            sumaNotas += alumnos[i].getNota();
        }
        
        sumaNotas = sumaNotas/n;
        System.out.printf("\nEl promedio de notas es: %.2f\n", sumaNotas);
    }
    
}