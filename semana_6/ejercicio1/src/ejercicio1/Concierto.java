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
        Zona nueva = new Zona(nombre, 100,10,new Entrada[10]);
        for(int i = 0; i < nueva.getCapacidad(); i++){
            nueva.getEntradas()[i] = new Entrada(i+1, "LIBRE", null);
        }
        
        Zona[] nuevoArray = new Zona[zonas.length + 1];
        for(int i = 0; i < zonas.length; i++){
            nuevoArray[i] = zonas[i];
        }
        nuevoArray[zonas.length] = nueva;
        this.zonas = nuevoArray;
        return true;
    }
    
    public boolean eliminarZona(String nombre){
        int count = 0;
        for(Zona z: zonas){
            if(!z.getNombre().equalsIgnoreCase(nombre)) count ++;
        }
        if(count == zonas.length) return false;
        Zona[] nuevoArray = new Zona[count];
        int idx = 0;
        for(Zona z: zonas){
            if(!z.getNombre().equalsIgnoreCase(nombre)){
                nuevoArray[idx++] = z;
            }
        }
        this.zonas = nuevoArray;
        return true;
    }
    
    @Override
    public String toString() {
        return "Concierto{" + "nombre=" + nombre + ", fecha=" + fecha + ", zonas=" + zonas + '}';
    }
    
}
