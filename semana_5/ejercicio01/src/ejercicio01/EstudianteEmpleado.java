package ejercicio01;

import java.util.Scanner;

public class EstudianteEmpleado extends Estudiante {
    Scanner sc = new Scanner(System.in);
    
    private String codigoEmpleado;
    private String turno;

    public EstudianteEmpleado(){
        codigoEmpleado = " ";
        turno = " ";
    }
    
    public EstudianteEmpleado(String codigoEmpleado, String turno, String codigo, String carrera, double promedio, String nombre, String direccion, String sexo, String fechaNacimiento, int edad) {
        super(codigo, carrera, promedio, nombre, direccion, sexo, fechaNacimiento, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Ingrese su:");
        setCodigoEmpleado(sc.next());
        System.out.println("Ingrese su turno: ");
        setTurno(sc.next());
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        
    }

    @Override
    public String toString() {
        return "EstudianteEmpleado{" + "sc=" + sc + ", codigoEmpleado=" + codigoEmpleado + ", turno=" + turno + '}';
    }
    
}