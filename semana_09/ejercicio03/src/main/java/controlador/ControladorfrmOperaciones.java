package controlador;

import datos.Repositorio;
import java.awt.event.ActionEvent;
import modelo.OperacionMatematica;
import vista.frmOperaciones;
import vista.frmIngreso;

public class ControladorfrmOperaciones {
    private final frmOperaciones vista;

    public ControladorfrmOperaciones(OperacionMatematica modelo, frmOperaciones vista){
        this.vista = vista;
        this.vista.btnSumar.addActionListener((ActionEvent e) -> {
            modelo.setOperador1(Integer.parseInt(vista.txtNumero1.getText()));
            modelo.setOperador2(Integer.parseInt(vista.txtNumero2.getText()));
            modelo.sumar();
            vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
        });
        
        this.vista.btnMultiplicar.addActionListener((ActionEvent e) -> {
            modelo.setOperador1(Integer.parseInt(vista.txtNumero1.getText()));
            modelo.setOperador2(Integer.parseInt(vista.txtNumero2.getText()));
            modelo.multiplicar();
            vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
        });

        this.vista.btnDividir.addActionListener((ActionEvent e) -> {
            modelo.setOperador1(Integer.parseInt(vista.txtNumero1.getText()));
            modelo.setOperador2(Integer.parseInt(vista.txtNumero2.getText()));
            modelo.dividir();
            vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
        });

        this.vista.btnSalir.addActionListener((ActionEvent e) -> {
            vista.dispose();
            frmIngreso vista1 = new frmIngreso();
            ControladorfrmUsuario controlador = new ControladorfrmUsuario(vista1, Repositorio.usuario);
            controlador.iniciar();
        });
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}