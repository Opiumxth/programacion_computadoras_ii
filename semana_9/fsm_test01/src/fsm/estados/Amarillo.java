package fsm.estados;

import fsm.Estado;
import fsm.Semaforo;

public class Amarillo implements Estado {
    @Override
    public void manejarEvento(Semaforo contexto, String evento){
        if(evento.equals("timer")){
            System.out.println("El semaforo cambia de amarillo a rojo");
            contexto.setEstado(new Rojo());
        }
        else{
            System.out.println("Evento ignorado, en amarillo solo se puede cambiar con timer");
        }
    }
    
    @Override
    public String nombre(){
        return "AMARILLO";
    }
}