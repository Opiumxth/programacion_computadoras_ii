import java.util.Scanner;

import modelo.*;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[BIENVENIDO AL SALON DE CLASES]\n");
        
        System.out.print("Ingrese el tipo de profesor: ");
        String nombre_tipo = sc.next();
        TipoProfesor tipo = new TipoProfesor(nombre_tipo, "A001"); // El codigo es uno al azar
        
        // Pedir datos del profesor
        Profesor prof = new Profesor(tipo);
        System.out.println("Ingrese los datos del profesor:");
        prof.ingresarDatos();
        
        // Pedir la cantidad de alumnos:
        System.out.print("\nIngresar la cantidad de alumnos: ");
        int n_alum = sc.nextInt();
        sc.nextLine();
        
        // Creadno el arreglo de alumnos
        Alumno[] alumnos = new Alumno[n_alum];
        
        // Instanciando e ingresando datos de cada alumno
        for (int i = 0; i < n_alum; i++){
            alumnos[i] = new Alumno();
            System.out.println("===ALUMNO["+(i+1)+"]");
            alumnos[i].ingresarDatos();
        }
        
        System.out.println("1. Mostrar datos completos");
        System.out.println("2. Mostrar tabla");
        System.out.print("Ingrese una opcion: ");
        int opc = sc.nextInt();
        
        switch (opc){
            case 1 -> {
                System.out.println("PROFESOR:");
                prof.mostrarDatos();
                System.out.println("ALUMNOS:");
                for(int i = 0; i < n_alum; i++){
                    System.out.println("Alumno ["+(i+1)+"]");
                    alumnos[i].mostrarDatos();
                    System.out.println("\n");
                }
            }
            case 2 -> {
                System.out.println("Profesor encargado:");
                System.out.println("CODIGO\tNOMBRE\tTIPO\tHORAS\tEDAD");
                System.out.printf("%-8s %-15s %-10s %-6d %-3d\n",
                        prof.getCodigo(),
                        prof.getNombre(),
                        nombre_tipo,
                        prof.getHoras(),
                        prof.getEdad());
                System.out.println("\nLista de alumnos: ");
                System.out.println("CODIGO\tNOMBRE\tCREDITO\tEDAD");
                for(int i = 0; i < n_alum; i++){
                System.out.printf("%-8s %-15s %-8d %-3d%n",
                        alumnos[i].getCodigo(),
                        alumnos[i].getNombre(),
                        alumnos[i].getCredito(),
                        alumnos[i].getEdad());
                }
            }
            default -> {
                System.out.println("Opcion invalida");
            }
        }   
    }
}