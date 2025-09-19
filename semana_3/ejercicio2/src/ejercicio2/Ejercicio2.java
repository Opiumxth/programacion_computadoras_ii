package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Esto es una prueba :)");
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Buen dia, "+nombre);
    }
}