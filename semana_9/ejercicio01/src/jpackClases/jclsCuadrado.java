package jpackClases;

import java.awt.*;
import java.awt.geom.*;

public class jclsCuadrado extends jclsFiguraGeometrica {
    final private int x, y;
    final private int ancho, alto;
    
    public jclsCuadrado(int x, int y, int ancho, int alto) {
        nombre = "CUADRADO";
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void dibujar(Graphics g){
        g2 = (Graphics2D)g;
                
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(new Rectangle2D.Double(x,y,ancho,alto));
        g2.setColor(new Color(71, 96, 161));
        g2.draw(new Rectangle2D.Double(x,y,ancho,alto));  
        g2.setFont(fuente);
        g2.drawString("CUADRADO",x+30,y+45);
    }
}