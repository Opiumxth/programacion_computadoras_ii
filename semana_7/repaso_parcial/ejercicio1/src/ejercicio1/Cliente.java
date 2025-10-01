package ejercicio1;

abstract class Cliente {
    protected String nombre;
    protected String direccion;
    protected String nacionalidad;

    public Cliente(String nombre, String direccion, String nacionalidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
    }

    public abstract String obtenerInfo();
}