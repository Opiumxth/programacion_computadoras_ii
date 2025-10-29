package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.OperacionMatematica;
import modelo.Usuario;
import vista.frmIngreso;
import vista.frmOperaciones;
        
public class ControladorfrmUsuario {
    private final frmIngreso vista;

    public ControladorfrmUsuario(frmIngreso vista, Usuario modelo) {
        this.vista = vista;
        
        this.vista.btnIngresar.addActionListener((ActionEvent e) -> {
            if (modelo.conectar( vista.txtUsuario.getText(), vista.txtContra.getText())) {
                // JOptionPane.showMessageDialog(vista, "Usuario Autenticado");
                vista.dispose();
                OperacionMatematica modelo1 = new OperacionMatematica();
                frmOperaciones vista1 = new frmOperaciones();
                ControladorfrmOperaciones controlador = new ControladorfrmOperaciones(modelo1, vista1);
                controlador.iniciar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error");
            }
        });

        this.vista.btnSalir.addActionListener((ActionEvent e) -> {
            vista.dispose();
            System.exit(0);
        });
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);        
        this.vista.txtUsuario.setText("");
        this.vista.txtContra.setText("");
    }
}