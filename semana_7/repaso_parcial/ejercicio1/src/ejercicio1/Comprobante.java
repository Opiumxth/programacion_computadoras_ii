package ejercicio1;

abstract class Comprobante {
    protected Cliente cliente;
    protected double monto;

    public Comprobante(Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    public double calcularTotal() {
        if (monto > 1000) {
            return monto * 0.6;
        } else if (monto > 500) {
            return monto * 0.7;
        } else {
            return monto;
        }
    }

    public abstract void imprimirComprobante();
}
