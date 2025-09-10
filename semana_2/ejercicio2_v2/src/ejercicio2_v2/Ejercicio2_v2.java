package ejercicio2_v2;

import java.util.Scanner;

public class Ejercicio2_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de empleados de la empresa: ");
        int n = sc.nextInt();
        Empresa obj = new Empresa(n);
	obj.ingresarTrabajadores(n);
	obj.presentarTrabajadores(n);
    }
}