package ejercicio1;

public class Boleta extends Comprobante {
    private String numeroBoleta;

    public Boleta(Cliente cliente, double monto, String numeroBoleta) {
        super(cliente, monto);
        this.numeroBoleta = numeroBoleta;
    }

    @Override
    public void imprimirComprobante() {
        System.out.println("Boleta Nro: " + numeroBoleta);
        System.out.println(cliente.obtenerInfo());
        System.out.println("Monto original: S/ " + monto);
        System.out.println("Total a pagar: S/ " + calcularTotal());
    }
}