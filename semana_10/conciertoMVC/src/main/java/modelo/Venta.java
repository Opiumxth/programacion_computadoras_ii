package modelo;

public class Venta {
    String fecha;
    int monto;
    Entrada[] entrada;
    Persona cliente;
    
    public boolean anular(){
        return true;
    }
}