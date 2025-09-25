package ejercicio1;

public class Entrada {
    private int numero;
    private String estado;
    private Venta venta;

    public Entrada(int numero, String estado, Venta venta) {
        this.numero = numero;
        this.estado = estado;
        this.venta = venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean vender(){
        if(this.estado.equals("LIBRE")){
            this.estado = "VENDIDA";
            return true;
        }
        return false;
    }
    
    public boolean liberar(){
        if(this.estado.equals("VENDIDA")){
            this.estado = "LIBRE";
            this.venta = null;
            return true;
        }
        return false;
    }
        
    @Override
    public String toString() {
        return "Entrada{" + "numero=" + numero + ", estado=" + estado + ", venta=" + venta + '}';
    }
    
}
