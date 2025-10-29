package ejercicio1;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private int campo;
    private float promedio;
    
    //Constructor
    public Alumno() {
        codigo = " ";
        nombre = " ";
        apellidos = " ";
        dni = " ";
    }
    
    public Alumno(String codigo, String nombre, String apellidos, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Getters y setters
    public int getCampo() {
        return campo;
    }

    public void setCampo(int campo) {
        this.campo = campo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    // Metodos
    public boolean participar(int pregunta){
        boolean result=true;
        return result;
    }
    
    public boolean asistir(int dia){
        boolean result=true;
        return result;
    }

    public boolean rendirEvaluacion(int tipoEvaluacion){
        boolean result=true;
        return result;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", promedio=" + promedio + '}';
    }   
}