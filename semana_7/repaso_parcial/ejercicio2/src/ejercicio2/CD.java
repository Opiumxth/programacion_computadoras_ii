package ejercicio2;

import java.util.Scanner;

public class CD extends Publicacion {
    Scanner sc = new Scanner(System.in);
    private double tiempoReproduccion;
    
    public CD(){
        tiempoReproduccion = 0;
    }
    
    public CD(double tiempoReproduccion, String titulo, double precio){
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    public double getTiempoReproduccion() {
        return tiempoReproduccion;
    }

    public void setTiempoReproduccion(double tiempoReproduccion) {
        this.tiempoReproduccion = tiempoReproduccion;
    }
    
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Tiempo de reproduccion (minutos): ");
        setTiempoReproduccion(sc.nextDouble());
    }

}