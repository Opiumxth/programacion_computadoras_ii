package ejercicio1;

public class Zona {
    private String nombre;
    private int precio;
    private int capacidad;
    private Entrada[] entradas;

    public Zona(String nombre, int precio, int capacidad, Entrada[] entradas) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.entradas = entradas;
    }

    public Entrada[] getEntradas() {
        return entradas;
    }

    public void setEntradas(Entrada[] entradas) {
        this.entradas = entradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    private boolean generarEntrada(){
        // Pass
        return true;
    }
    
    public Entrada[] mostrarEntradas(){
        
        return entradas;
    }
    
    public Entrada[] venderEntradas(int numero){
        int count = 0;
        Entrada[] vendidas = new Entrada[numero];
        for(Entrada e: entradas){
            if(count < numero && e.getEstado().equals("LIBRE")){
                e.vender();
                vendidas[count++] = e;
            }
        }
        if(count < numero){
            System.out.println("No hay suficeintes entradas libres en "+nombre);
        }
        return vendidas;
    }
    
    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", precio=" + precio + ", capacidad=" + capacidad + ", entradas=" + entradas + '}';
    }
}
