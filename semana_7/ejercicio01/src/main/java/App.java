import controlador.ControladorfrmOperaciones;
import modelo.OperacionMatematica;
import vista.frmOperaciones;

public class App {
    public static void main(String[] args) {
        OperacionMatematica modelo = new OperacionMatematica();
        frmOperaciones vista = new frmOperaciones();
        ControladorfrmOperaciones controlador = 
                new ControladorfrmOperaciones(modelo, vista);
        controlador.iniciar();
    }
}