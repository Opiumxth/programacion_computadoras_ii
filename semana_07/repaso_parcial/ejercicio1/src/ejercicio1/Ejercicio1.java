package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Cliente cliente1 = new PersonaNatural("Juan", "Lima", "Peruano", "12345678");

        // Compra de 1200 soles -> 40% de descuento
        Factura factura = new Factura(cliente1, 1200, "F001");

        factura.imprimirComprobante();
    }
}