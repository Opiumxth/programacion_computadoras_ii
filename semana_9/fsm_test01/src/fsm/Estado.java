package fsm;

public interface Estado {
    void manejarEvento(Semaforo contexto, String evento);
    String nombre();
}