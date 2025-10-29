package ejercicio01;

import java.util.Scanner;

public class Empleado extends Persona {
    Scanner sc = new Scanner(System.in);
    
    private String puesto;
    private int sueldo;
    private int exp;

    // Constructores
    public Empleado(){
        puesto = " ";
        sueldo = 0; 
        exp = 0;
    }
    
    public Empleado(String puesto, int sueldo, int exp, String nombre, String direccion, String sexo, String fechaNacimiento, int edad) {
        super(nombre, direccion, sexo, fechaNacimiento, edad);
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.exp = exp;
    }
    
    // Getters y Setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    // Ingresando los datos usando el super
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Ingresar el puesto del empleado: ");
        setPuesto(sc.next());
        System.out.print("Ingresar el sueldo del empleado: ");
        setSueldo(sc.nextInt());
        sc.nextLine();
        System.out.print("Ingrese los años de experiencia del empleado: ");
        setExp(sc.nextInt());
        sc.nextLine();
    }
    
    // Aqui mostraria a solo los empleados usado como empleado[i].mostrarInfo, ese empleado seria un arreglo de empleados
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Sueldo: " + getSueldo());
        System.out.println("Años de experiencia: " + getExp());
    }
    
    public void aumentarSueldo(int cantidad){
        setSueldo(getSueldo() + cantidad);
    }
    
    public void cambiarPuesto(String nuevoPuesto){
        setPuesto(nuevoPuesto);
    }
        
    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", sueldo=" + sueldo + ", exp=" + exp + '}';
    }

}