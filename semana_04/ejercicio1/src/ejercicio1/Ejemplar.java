package ejercicio1;

public class Ejemplar {
    private String numeroAcceso;
    private boolean disponible = true;

    public Ejemplar(String numeroAcceso){
        this.numeroAcceso = numeroAcceso;
    }
    
    public String getNumeroAcceso() {
        return numeroAcceso;
    }

    public void setNumeroAcceso(String numeroAcceso) {
        this.numeroAcceso = numeroAcceso;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void marcarPrestado(){
        setDisponible(false);
    }
}
