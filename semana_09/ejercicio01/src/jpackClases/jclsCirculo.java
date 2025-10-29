package jpackClases;

import java.awt.*;
import java.awt.geom.*;

public class jclsCirculo extends jclsFiguraGeometrica {
    final private int x, y, ancho, alto;
    
    public jclsCirculo(int x, int y, int ancho, int alto) {
        nombre = "CIRCULO";
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void dibujar(Graphics g){
        g2 = (Graphics2D)g;
        
        // Para usar colores pasando el codigo rbg se hace lo siguiente
        // En vez de (Color.color) es (new Color(r,b,g))
        g2.setColor(new Color(0, 71, 21));
        g2.fill(new Ellipse2D.Double(x,y,ancho,alto));
        g2.setColor(new Color(201, 222, 255));
        g2.draw(new Ellipse2D.Double(x,y,ancho,alto));  
        g2.setFont(fuente);
        g2.drawString("CIRCULO",x+55,y+50);
    }    
}