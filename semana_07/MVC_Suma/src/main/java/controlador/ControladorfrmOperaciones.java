package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.OperacionMatematica;
import vista.frmOperaciones;

public class ControladorfrmOperaciones {
    private OperacionMatematica modelo;
    private frmOperaciones vista;
      
    

    public ControladorfrmOperaciones(OperacionMatematica modelo, frmOperaciones vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSumar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.parseInt(vista.txtPrimerNumero.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtSegundoNumero.getText()));
                modelo.sumar();
                vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
            }
        });
    }
    
     public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    
}
