package ejercicio1;

public class PersonaNatural extends Cliente {
    private String dni;

    public PersonaNatural(String nombre, String direccion, String nacionalidad, String dni) {
        super(nombre, direccion, nacionalidad);
        this.dni = dni;
    }

    @Override
    public String obtenerInfo() {
        return "Persona Natural: " + nombre + ", DNI: " + dni + ", Nacionalidad: " + nacionalidad;
    }
}
