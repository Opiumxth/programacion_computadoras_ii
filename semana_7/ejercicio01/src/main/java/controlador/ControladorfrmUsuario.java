package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.OperacionMatematica;
import modelo.Usuario;
import vista.frmIngreso;
import vista.frmOperaciones;
        
public class ControladorfrmUsuario {
    private frmIngreso vista;
    private Usuario modelo;

    public ControladorfrmUsuario(frmIngreso vista, Usuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnIngresar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( modelo.conectar( vista.txtUsuario.getText(), vista.txtContra.getText())) {
                    // JOptionPane.showMessageDialog(vista, "Usuario Autenticado");
                    vista.dispose();
                    OperacionMatematica modelo = new OperacionMatematica();
                    frmOperaciones vista = new frmOperaciones();
                    ControladorfrmOperaciones controlador = 
                            new ControladorfrmOperaciones(modelo, vista);
                    controlador.iniciar();

                }else {
                    JOptionPane.showMessageDialog(vista, "Error");
                }
            }
        });
        
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                System.exit(0);
            }
        });
        
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);        
        this.vista.txtUsuario.setText("");
        this.vista.txtContra.setText("");
    }
}