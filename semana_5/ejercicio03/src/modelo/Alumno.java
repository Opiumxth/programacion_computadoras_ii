package modelo;

import java.util.Scanner;

public class Alumno extends Persona {
    Scanner sc = new Scanner(System.in);
    
    private int credito;

    public Alumno(){
        credito = 0;
    }
    
    public Alumno(int credito, String nombre, String codigo, int edad) {
        super(nombre, codigo, edad);
        this.credito = credito;
    }

    // Set y get
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    public void rendirExamen(){
        // pass
    }

    // Ingresar los datos
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Ingresar el credito:");
        setCredito(sc.nextInt());
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.print("Credito: " + getCredito());
    }
    
    // registrarAsistencia
    @Override
    public void registrarAsistencia(){
        // pass
    }

    @Override
    public String toString() {
        return "Alumno{"  + ", nombre=" + getNombre() + ", codigo=" + getCodigo() + 
               ", edad=" + edad + "credito=" + credito + '}';
    }
}