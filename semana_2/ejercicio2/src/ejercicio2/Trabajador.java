package ejercicio2;

import java.util.Scanner;

public class Trabajador {
    Scanner sc = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private String cargo;
    private int horas;

    public Trabajador() {
        codigo = " ";
        nombre = " ";
        cargo = " ";
        horas = 0;
    }

    public Trabajador(String codigo, String nombre, String cargo, int horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.horas = horas;
    }

    // Setters n getters
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    // Pago por cargo
    public int pagoCargo(){
        if (cargo.equalsIgnoreCase("obrero")){
            return horas*100;
        }
        else if (cargo.equalsIgnoreCase("empleado")){
            return horas*200;
        }
        else if (cargo.equalsIgnoreCase("asesor")){
            return horas*300;
        }
        else{
            System.out.println("Cargo invalido");
            return 0;
        }
    }

    // Ingresar datos
    public void ingresarDatos(){
        System.out.print("Ingresar el codigo: ");
        setCodigo(sc.nextLine());
        System.out.print("Ingrese el nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Ingrese el cargo (obrero/empleado/asesor): ");
        setCargo(sc.nextLine());
        System.out.print("Ingrese las horas trabajadas: ");
        setHoras(sc.nextInt());
    }
    
    
    // Mostrar los datos por empleado
    public void mostrarDatos(){
        int sueldo = pagoCargo();
        System.out.printf("%-10s %-15s %-10s %-10s %-10d\n", getCodigo(), getNombre(), getCargo(), getHoras(), sueldo);
    }
    
}