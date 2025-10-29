package modelo;

public class Persona {
    Tarjeta tarjeta;
    String nombres;
    String apellidos;
    String DNI;
    String password;
    Venta venta;
    
    public boolean registrar(){
        return true;
    }
    
    public boolean eliminarTarjeta(){
        return true;
    }
    
    public boolean anularVenta(){
        return true;
    }
    
    public boolean comprar(){
        return true;
    }
}