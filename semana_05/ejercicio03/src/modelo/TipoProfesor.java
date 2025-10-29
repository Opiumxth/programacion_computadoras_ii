package modelo;

public class TipoProfesor {
    private String nombre;
    private String codigo;

    // Constructor
    public TipoProfesor(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}