package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
    // Aqui sera el programa principal
        Scanner sc = new Scanner(System.in);
        
        int totalPersonas = 0;
        System.out.println("Ingresar la cantidad de empleados: ");
        int numEmp = sc.nextInt();
        System.out.println("Ingresar la cantidad de estudiantes: ");
        int numEst = sc.nextInt();
        System.out.println("Ingresar la cantidad de estudiantes que trabajan: ");
        int numEstEmp = sc.nextInt();
        boolean EstEmp = true;
        if (numEstEmp < numEst || numEstEmp < numEmp){
            System.out.println("La cantidad ingresada es invalida");
            EstEmp = false;
        }

        if (numEst > 0){
            totalPersonas += numEst;
        }
        if(numEmp > 0){
            totalPersonas += numEmp;
        }
        if (numEstEmp > 0){
            totalPersonas += numEstEmp;
        }


        // Creamos los arreglos de estudiantes, etc
        if(numEmp > 0){
            Empleado[] empleados = new Empleado[numEmp];
        }
        if (numEst > 0){
            Estudiante[] estudiantes = new Estudiante[numEst];
        }
        if(EstEmp){
            EstudianteEmpleado[] estudiantesEmpleados = new EstudianteEmpleado[numEstEmp];
        }
        
        // Arreglo de personas en total
        Persona[] personas = new Persona[totalPersonas];
        
        // Instanciar e ingresar datos
        for(int i = 0; i < totalPersonas; i++){
            // Empleados
            
            // Estudiantes
            
        
        }
        
        
    }
}