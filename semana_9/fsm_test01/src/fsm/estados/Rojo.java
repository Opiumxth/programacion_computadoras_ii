package fsm.estados;

import fsm.Estado;
import fsm.Semaforo;

public class Rojo implements Estado {
    
    @Override
    public void manejarEvento(Semaforo contexto, String evento){
        if(evento.equals("timer")){
            System.out.println("El semaforo cambia de rojo a verde");
            contexto.setEstado(new Verde());
        }
        else{
            System.out.println("Evento ignorado, el rojo solo se puede cambiar con timer");
        }
    }
    
    @Override
    public String nombre(){
        return "ROJO";
    }
}