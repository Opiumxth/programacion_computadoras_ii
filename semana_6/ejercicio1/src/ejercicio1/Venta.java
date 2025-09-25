package ejercicio1;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private int monto;
    private Entrada[] entradas; // Max 4 entradas
    private Persona cliente;

    public Venta(LocalDate fecha, int monto, Entrada[] entradas, Persona cliente) {
        this.fecha = fecha;
        this.monto = monto;
        this.entradas = entradas;
        this.cliente = cliente;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Entrada[] getEntradas() {
        return entradas;
    }

    public void setEntradas(Entrada[] entradas) {
        this.entradas = entradas;
    }

    public boolean anular(){
        return true;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", monto=" + monto + ", entradas=" + entradas + ", cliente=" + cliente + '}';
    }
    
}