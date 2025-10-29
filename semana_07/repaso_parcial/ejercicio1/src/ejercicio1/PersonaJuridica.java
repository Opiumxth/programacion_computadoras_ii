package ejercicio1;

public class PersonaJuridica extends Cliente {
    private String ruc;

    public PersonaJuridica(String nombre, String direccion, String nacionalidad, String ruc) {
        super(nombre, direccion, nacionalidad);
        this.ruc = ruc;
    }

    @Override
    public String obtenerInfo() {
        return "Persona Juridica: " + nombre + ", RUC: " + ruc + ", Nacionalidad: " + nacionalidad;
    }
}
