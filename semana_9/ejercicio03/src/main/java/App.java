import controlador.ControladorfrmUsuario;
import datos.Repositorio;
import vista.frmIngreso;

public class App {
    public static void main(String[] args) {
        frmIngreso vista = new frmIngreso();
        ControladorfrmUsuario controlador = new ControladorfrmUsuario(vista, Repositorio.usuario);
        controlador.iniciar();
    }
}