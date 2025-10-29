package jpackClases;

import java.awt.*;
import java.awt.geom.*;

public class jclsRectangulo extends jclsFiguraGeometrica {
    final private int x, y, ancho, alto;    
    
    public jclsRectangulo(int x, int y, int ancho, int alto) {
        nombre = "RECTANGULO";        
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void dibujar(Graphics g){
        g2 = (Graphics2D)g;
                
        g2.setColor(new Color(237, 204, 237));
        g2.fill(new Rectangle2D.Double(x,y,ancho,alto));
        g2.setColor(new Color(117, 17, 6));
        g2.draw(new Rectangle2D.Double(x,y,ancho,alto));
        g2.setFont(fuente);
        g2.drawString("RECTANGULO",x+50,y+50);
    }    
}
