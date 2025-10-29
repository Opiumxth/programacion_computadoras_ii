package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar la cantidad de empleados: ");
        int numEmp = sc.nextInt();

        System.out.print("Ingresar la cantidad de estudiantes: ");
        int numEst = sc.nextInt();

        System.out.print("Ingresar la cantidad de estudiantes que trabajan: ");
        int numEstEmp = sc.nextInt();

        // Calcular total de personas
        int totalPersonas = numEmp + numEst + numEstEmp;

        // Arreglos para cada tipo
        Empleado[] empleados = new Empleado[numEmp];
        Estudiante[] estudiantes = new Estudiante[numEst];
        EstudianteEmpleado[] estudiantesEmpleados = new EstudianteEmpleado[numEstEmp];

        // Arreglo general de personas
        Persona[] personas = new Persona[totalPersonas];

        int idx = 0;

        // Empleados
        for (int i = 0; i < numEmp; i++) {
            empleados[i] = new Empleado();
            System.out.println("\n[EMPLEADO " + (i + 1) + "]");
            empleados[i].ingresarDatos();
            personas[idx++] = empleados[i];
        }

        // Estudiantes
        for (int i = 0; i < numEst; i++) {
            estudiantes[i] = new Estudiante();
            System.out.println("\n[ESTUDIANTE " + (i + 1) + "]");
            estudiantes[i].ingresarDatos();
            personas[idx++] = estudiantes[i];
        }

        // Estudiantes Empleados
        for (int i = 0; i < numEstEmp; i++) {
            estudiantesEmpleados[i] = new EstudianteEmpleado();
            System.out.println("\n[ESTUDIANTE EMPLEADO " + (i + 1) + "]");
            estudiantesEmpleados[i].ingresarDatos();
            personas[idx++] = estudiantesEmpleados[i];
        }

        // Mostrar todos los datos
        System.out.println("\n=== LISTA DE TODAS LAS PERSONAS ===");
        for (Persona p : personas) {
            p.mostrarDatos();
            System.out.println("-----------------------------");
        }
    }
}