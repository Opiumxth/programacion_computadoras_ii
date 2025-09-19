package ejercicio01;

import java.util.Scanner;

public class Estudiante extends Persona {
    Scanner sc = new Scanner(System.in);
    
    protected String codigo;
    protected String carrera;
    protected double promedio;

    public Estudiante(){
        codigo = " ";
        carrera = " ";
        promedio = 0;
    
    }
    
    public Estudiante(String codigo, String carrera, double promedio, String nombre, String direccion, String sexo, String fechaNacimiento, int edad) {
        super(nombre, direccion, sexo, fechaNacimiento, edad);
        this.codigo = codigo;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    // next() -> solo una palabra
    // nextLine() -> toda una linea
    
    // Ingresando los datos
    @Override
    public void ingresarDatos(){
        // Al llamar al super.ingresarDatos() se piden los datos desde la clase persona
        super.ingresarDatos();
        System.out.print("Ingresar el codigo del estudiante: ");
        setCodigo(sc.next());
        sc.nextLine();
        System.out.print("Ingresar la carrera del estudiante: ");
        setCarrera(sc.nextLine());
        System.out.print("Ingrese el promedio del estudiante: ");
        setPromedio(sc.nextDouble());
    }
    
    // Aqui mostraria a solo los estudiantes usado como estudiantes[i].mostrarInfo, ese estudiantes seria un arreglo de estudiantes
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Promedio: " + getPromedio());
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", carrera=" + carrera + ", promedio=" + promedio + '}';
    }

}