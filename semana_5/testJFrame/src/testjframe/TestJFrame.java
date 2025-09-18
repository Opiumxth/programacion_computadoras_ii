package testjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Programa de escritorio");
        ventana.setSize(1280, 720);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JLabel etiqueta = new JLabel("Pantalla inicial", SwingConstants.CENTER);
        JButton boton = new JButton("Cambiar texto");

        // Evento para actualizar la ventana
        boton.addActionListener((ActionEvent e) -> {
            etiqueta.setText("El contenido cambió");
        });

        ventana.add(etiqueta, BorderLayout.CENTER);
        ventana.add(boton, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}
