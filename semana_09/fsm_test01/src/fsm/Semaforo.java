package fsm;

import fsm.estados.*;

public class Semaforo {
    private Estado estadoActual;
    
    // Constructor indicando con que estado se inicia
    public Semaforo(){
        estadoActual = new Rojo();
    }
    
    // Cambiar de estado
    public void setEstado(Estado nuevoEstado){
        System.out.printf("Transicion de %s hacia %s\n", estadoActual.nombre(), nuevoEstado.nombre());
        estadoActual = nuevoEstado;
    }

    public void manejarEvento(String evento){
        estadoActual.manejarEvento(this, evento);
    }
    
    public String getEstadoActual(){
        return estadoActual.nombre();
    }
}