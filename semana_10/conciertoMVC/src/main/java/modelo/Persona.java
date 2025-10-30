package modelo;

public class Persona {
    String DNI;
    Tarjeta tarjeta;
    String nombres;
    String apellidos;
    String password;
    Venta venta;
    
    public boolean registrarTarjeta(){
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