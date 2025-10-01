package ejercicio1;

public class Factura extends Comprobante {
    private String numeroFactura;

    public Factura(Cliente cliente, double monto, String numeroFactura) {
        super(cliente, monto);
        this.numeroFactura = numeroFactura;
    }

    @Override
    public void imprimirComprobante() {
        System.out.println("Factura Nro: " + numeroFactura);
        System.out.println(cliente.obtenerInfo());
        System.out.println("Monto original: S/ " + monto);
        System.out.println("Total a pagar: S/ " + calcularTotal());
    }
}
