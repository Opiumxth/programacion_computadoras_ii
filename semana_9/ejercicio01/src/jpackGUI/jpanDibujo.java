package jpackGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;        

import jpackClases.*;
        
public class jpanDibujo extends JPanel{
    private String nombre;
    
    public jpanDibujo() {
        setNombre("CIRCULO"); // La figura de inicio?
    }
        
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        
        if(nombre.equalsIgnoreCase("CIRCULO")){
            jclsCirculo C = new jclsCirculo(50,50,250,250);
            C.dibujar(g2);                
        }
        
        if(nombre.equalsIgnoreCase("RECTANGULO")){
            jclsRectangulo R = new jclsRectangulo(50,50,400,250);
            R.dibujar(g2);                
        }
        
        if(nombre.equalsIgnoreCase("CUADRADO")){
            jclsCuadrado R = new jclsCuadrado(50,50,250,250);
            R.dibujar(g2);                
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}