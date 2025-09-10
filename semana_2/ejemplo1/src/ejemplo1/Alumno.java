package ejemplo1;

import java.util.Scanner;

public class Alumno {
    Scanner sc = new Scanner(System.in);
    
    private String codigo;
    private String nombre;
    private double nota;

    // Metodos constructor

    public Alumno() {
        codigo = " ";
        nombre = " ";
        nota = 0;
    }
    
    public Alumno(String codigo, String nombre, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarDatos(){
        System.out.print("Ingresar el codigo del alumno: ");
        setCodigo(sc.nextLine());
        System.out.print("Ingresar el nombre del alumno: ");
        setNombre(sc.nextLine());
        System.out.print("Ingresar la nota del alumno: ");
        setNota(sc.nextDouble());
        sc.nextLine();
    }
    
    public void mostrarDatos(){
        System.out.printf("%-10s %-15s %-4.2f", getCodigo(), getNombre(), getNota());
    }

}