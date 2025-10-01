package ejercicio2;

import java.util.Scanner;

public class Publicacion {
    Scanner sc = new Scanner(System.in);
    
    private String titulo;
    private double precio;
    
    public Publicacion(){
        titulo = " ";
        precio = 0;
    }
    
    public Publicacion(String titulo, double precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void ingresarDatos(){
        System.out.print("Titulo: ");
        setTitulo(sc.nextLine());
        System.out.print("Precio: ");
        setPrecio(sc.nextDouble());
    }

}
