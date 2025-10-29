package modelo;

public class Concierto {
    String nombre;
    String fecha;
    Zona[] zonas;
    
    public boolean agregarZona(String nombre){
        System.out.println("Metodo agregar zona");
        return true;
    }
    
    public boolean eliminarZona(){
        System.out.println("Metodo eliminar zona");
        return false;
    }
}