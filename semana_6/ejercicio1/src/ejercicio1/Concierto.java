package ejercicio1;

import java.time.LocalDate;

public class Concierto {
    private String nombre;
    private LocalDate fecha;
    private Zona[] zonas;

    public Concierto(String nombre, LocalDate fecha, Zona[] zonas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = zonas;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean agregarZona(String nombre){
        // Pass
        boolean something = true;
        return something;
    }
    
    public boolean eliminarZona(String nombre){
        // Pass
        boolean something = true;
        return something;
    }
    
    @Override
    public String toString() {
        return "Concierto{" + "nombre=" + nombre + ", fecha=" + fecha + ", zonas=" + zonas + '}';
    }
    
    
}
