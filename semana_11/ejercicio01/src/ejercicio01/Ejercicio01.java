package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==PROGRAMA 1==");
        System.out.println("1. Comparar enteros");
        System.out.println("2. Comparar decimales");
        System.out.println("3. Comparar racionales");
        System.out.println("4. Comparar complejos");
        System.out.print("Selecciona una opcion: ");
        int opc = sc.nextInt();
        
        switch(opc){
            case 1 -> {
                System.out.println("COMPARANDO ENTEROS");
                System.out.print("Ingrese un numero: ");
                int a = sc.nextInt();
                System.out.print("Ingrese otro numero: ");
                int b = sc.nextInt();
                // Creamos el objeto pareja
                Pareja par = new Pareja(a, b);
                int maximo = (int) par.max();
                System.out.println("El maximo de los enteros es: "+ maximo);
                int minimo = (int) par.min();
                System.out.println("El minimo de los enteros es: "+ minimo);
            }
            case 2 -> {
                System.out.println("COMPARANDO FLOTANTES");
                System.out.print("Ingrese un numero: ");
                double a = sc.nextInt();
                System.out.print("Ingrese otro numero: ");
                double b = sc.nextInt();
                // Creamos el objeto pareja
                Pareja par = new Pareja(a, b);
                double maximo = (double) par.max();
                System.out.println("El maximo de los flotantes es: "+ maximo);
                double minimo = (double) par.min();
                System.out.println("El minimo de los flotantes es: "+ minimo);            
            }
            case 3 -> {
                System.out.println("COMPARANDO RACIONALES");
                System.out.print("Ingrese un numerador 1: ");
                int a = sc.nextInt();
                System.out.print("Ingrese otro denominador 1: ");
                int b = sc.nextInt();
                System.out.print("Ingrese un numerador 2: ");
                int c = sc.nextInt();
                System.out.print("Ingrese otro denominador 2: ");
                int d = sc.nextInt();
                
                // Creamos los objetos racionales con los denominadores y numeradores respectivamente
                Racional r1 = new Racional(a,b);
                Racional r2 = new Racional(c,d);
                
                // Creamos el objeto pareja
                Pareja par = new Pareja(r1, r2);
                
                Racional maximo = (Racional) par.max();
                System.out.println("El maximo de los racionales es: "+ maximo.toString());
                Racional minimo = (Racional) par.min();
                System.out.println("El minimo de los racionales es: "+ minimo.toString());
            }
            case 4 -> {
                System.out.println("COMPARANDO COMPLEJOS");
                System.out.print("Ingrese el entero 1: ");
                int a = sc.nextInt();
                System.out.print("Ingrese el complejo 1: ");
                int b = sc.nextInt();
                System.out.print("Ingrese el entero 2: ");
                int c = sc.nextInt();
                System.out.print("Ingrese el complejo 2: ");
                int d = sc.nextInt();
                
                // Creamos los objetos racionales con los denominadores y numeradores respectivamente
                Complejo c1 = new Complejo(a,b);
                Complejo c2 = new Complejo(c,d);
                
                // Creamos el objeto pareja
                Pareja par = new Pareja(c1, c2);
                
                Complejo maximo = (Complejo) par.max();
                System.out.println("El maximo de los complejos es: "+ maximo.toString());
                Racional minimo = (Racional) par.min();
                System.out.println("El minimo de los complejos es: "+ minimo.toString());
            }
            default -> {
                System.out.println("Opcion invalida!");
            }
        }
    }
}