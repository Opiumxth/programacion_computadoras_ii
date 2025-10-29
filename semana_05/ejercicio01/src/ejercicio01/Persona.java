package ejercicio01;

import java.util.Scanner;

public class Persona {
    Scanner sc = new Scanner(System.in);
    
    protected String nombre;
    protected String direccion;
    protected String sexo;
    protected String fechaNacimiento;
    protected int edad;

    // Constructores
    public Persona(){
        nombre = " ";
        direccion = " ";
        sexo = " ";
        fechaNacimiento = " ";
        edad = 0;
    }
    
    public Persona(String nombre, String direccion, String sexo, String fechaNacimiento, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
    
    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        System.out.print("Ingrese su sexo: ");
        setSexo(sc.next());
        System.out.print("Ingrese la edad: ");
        setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Ingrese la direccion: ");
        setDireccion(sc.nextLine());
        System.out.println("");
        setFechaNacimiento(sc.nextLine());
    }

    // nombre, sexo, edad, direccion, fecha de nacimineto 
    // Aqui se muestran los datos de todas la personas
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
    }
}