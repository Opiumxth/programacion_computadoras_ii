package modelo;

import java.util.Date;

public class Venta {
    Date fecha;
    int monto;
    Entrada[] entrada;
    Persona cliente;
    
    public boolean anular(){
        return true;
    }
}