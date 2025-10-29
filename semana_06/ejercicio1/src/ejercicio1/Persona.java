package ejercicio1;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String clave;
    private Venta venta;
    private Tarjeta tarjeta;

    public Persona(String nombre, String apellidos, String dni, String clave, Venta venta, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.clave = clave;
        this.venta = venta;
        this.tarjeta = tarjeta;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    // Falta implementar
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
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", clave=" + clave + ", venta=" + venta + ", tarjeta=" + tarjeta + '}';
    }
    
}
