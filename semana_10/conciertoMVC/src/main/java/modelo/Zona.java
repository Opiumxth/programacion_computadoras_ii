package modelo;

public class Zona {
    String nombre;
    int capacidad;
    int precio;
    Entrada[] entradas;
    
    public boolean generarEntrada(){
        return true;
    }
    
    public Entrada[] mostrarEntrada(){
        return entradas;
    }
    
    public Entrada[] venderEntrada(){
        return entradas;
    }
}