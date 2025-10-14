package fsm_test01;

import fsm.Semaforo;


public class Fsm_test01 {
    public static void main(String[] args) throws InterruptedException {
        Semaforo semaforo = new Semaforo();
    
        System.out.println("Estado inicial: " + semaforo.getEstadoActual());
        String evento = "timer";
        
        for(int i = 0; i < 6; i++){
            Thread.sleep(1000);
            semaforo.manejarEvento(evento);
            System.out.println("Estado actual: " + semaforo.getEstadoActual());
            System.out.println("+~~~~~~~~~~~~~~+");
        }
    }
}