package modelo;

import java.util.Scanner;

public class Profesor extends Persona {
    Scanner sc = new Scanner(System.in);
    
    private int horas;
    private TipoProfesor tipo;
    
    // Constructor
    public Profesor(){
        horas = 0;
    }

    public Profesor(TipoProfesor tipo){
        horas = 0;
        this.tipo = tipo;
    }
    
    public Profesor(int horas,TipoProfesor tipo, String nombre, String codigo, int edad) {
        super(nombre, codigo, edad);
        this.horas = horas;
        this.tipo = tipo;
    }

    // Set y get
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public TipoProfesor getTipo() {
        return tipo;
    }

    public void setTipo(TipoProfesor tipo) {
        this.tipo = tipo;
    }
    
    // Ingresando los datos
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Ingrese las horas de enseñanza: ");
        setHoras(sc.nextInt());
        sc.nextLine();
        setTipo(getTipo());
    }
    
    // Mostrando los datos
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Horas: " + getHoras());
    }
    
    public void prepararEvaluacion(){
        System.out.println("Preparando evaluacion :)");
    }
    
    @Override
    public void registrarAsistencia(){
        System.out.println("Registrando asistencia");
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + getNombre() + ", codigo=" + getCodigo() + 
                ", edad=" + getEdad() + ", horas=" + horas + ", tipo=" + tipo.getNombre() + '}';
    }

}