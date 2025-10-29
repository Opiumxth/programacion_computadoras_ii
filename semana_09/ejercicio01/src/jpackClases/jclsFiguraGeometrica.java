package jpackClases;

import java.awt.*;

abstract class jclsFiguraGeometrica {
    protected String nombre;
    protected Graphics2D g2;
    protected Font fuente;
    
    public jclsFiguraGeometrica() {
        nombre = "Figura";
        fuente = new Font("ARIAL",Font.BOLD,30);
    }
    
    abstract void dibujar(Graphics g);
}