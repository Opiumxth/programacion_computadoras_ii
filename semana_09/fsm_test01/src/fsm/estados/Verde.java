package fsm.estados;

import fsm.Estado;
import fsm.Semaforo;

public class Verde implements Estado {
    
    @Override
    public void manejarEvento(Semaforo contexto, String evento){
        if(evento.equals("timer")){
            System.out.println("El semaforo cambia de verde a amarillo");
            contexto.setEstado(new Amarillo());
        }
        else{
            System.out.println("Evento ignorado, el rojo solo se puede cambiar con timer");
        }
    }
    
    @Override
    public String nombre(){
        return "VERDE";
    }
}