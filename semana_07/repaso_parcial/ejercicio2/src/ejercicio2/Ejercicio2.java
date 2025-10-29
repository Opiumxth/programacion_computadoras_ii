package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de libros: ");
        int numLibros = sc.nextInt();
        System.out.print("Ingrese el numero de CDs: ");
        int numCDs = sc.nextInt();
        
        // Creamos los arreglos
        Libro[] libros = new Libro[numLibros];
        CD[] cds = new CD[numCDs];        

        for(int i = 0; i < numLibros; i++){
            System.out.println("[LIBRO "+(i+1)+"]");
            libros[i] = new Libro();
            libros[i].ingresarDatos();
        }
        
        for(int i = 0; i < numCDs; i++){
            System.out.println("[CD "+(i+1)+"]");
            cds[i] = new CD();
            cds[i].ingresarDatos();
        }
        
    }
    
}
