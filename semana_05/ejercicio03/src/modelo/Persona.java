package modelo;

import java.util.Scanner;

public abstract class Persona {
    Scanner sc = new Scanner(System.in);
    
    protected String nombre;
    protected String codigo;
    protected int edad;

    // Constructores
    public Persona(){
        nombre = " ";
        codigo = " ";
        edad = 0;
    }

    public Persona(String nombre, String codigo, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }
    
    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Ingresando los datos
    public void ingresarDatos(){
        System.out.print("Ingrese el nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Ingrese el codigo: ");
        setCodigo(sc.nextLine());
        System.out.print("Ingrese la edad: ");
        setEdad(sc.nextInt());
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Edad: " + getEdad());
    }
    
    //Registrar asistencia
    public abstract void registrarAsistencia();
    
    @Override
    public String toString() {
        return "Persona{" + ", nombre=" + nombre + ", codigo=" + codigo + ", edad=" + edad + '}';
    }
}