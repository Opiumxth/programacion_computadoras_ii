package jpackGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class jclsInicio extends JFrame implements ActionListener {
    private JMenuBar jmnubBarra;
    private JMenu jmnuArchivo, jmnuPoligono;
    private JMenuItem jmnuiIniciar, jmnuiCerrar, jmnuiSalir; // Opciones validas dentro deel menu
    private JMenuItem jmnuiRect, jmnuiCir, jmnuiCua;
    private JSeparator jsep1;
    private JPanel jpanFondo, jpanLimpiar;
    private jpanDibujo jpanDibu;

    // Constructor por defecto, inicia la ventana al crear el objeto, pero este no requiere ningun metodo?
    public jclsInicio(){
        this.setTitle("Semana 9 - Guia 6: Clases Abstractas");
        this.setSize(800,600);
        this.setLocation(500,300);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Permite cerrar con X la ventana
        
        preparBarraMenu();
        prepararPanelFondo();
        prepararPanelLimpiar();
        prepararPanelDibujo();
    }
    
    public void preparBarraMenu(){
        jmnubBarra = new JMenuBar();
        
        jmnuArchivo = new JMenu("Archivo");        
        jmnuPoligono = new JMenu("Poligono");        
        
        jmnuiIniciar = new JMenuItem("Iniciar sesión");
        jmnuiCerrar = new JMenuItem("Cerrar sesión");
        jmnuiSalir = new JMenuItem("Salir");
        
        jmnuiRect = new JMenuItem("Rectángulo");
        jmnuiCir = new JMenuItem("Círculo");
        jmnuiCua = new JMenuItem("Cuadrado");
        
        // Esto no sé
        jmnuArchivo.setMnemonic('A');
        jmnuPoligono.setMnemonic('P');
        
        // Colores de los elementos de la barra
        jmnubBarra.setBackground(new Color(218, 227, 225));
        jmnuArchivo.setForeground(Color.blue);
        jmnuPoligono.setForeground(Color.blue);
        jmnuiIniciar.setBackground(new Color(218, 227, 225));
        jmnuiIniciar.setForeground(Color.blue);
        jmnuiCerrar.setBackground(new Color(218, 227, 225));
        jmnuiCerrar.setForeground(Color.red);
        jmnuiSalir.setBackground(Color.white);
        jmnuiSalir.setForeground(Color.black);
        jmnuiRect.setBackground(new Color(218, 227, 225));
        jmnuiRect.setForeground(Color.blue);
        jmnuiCir.setBackground(new Color(218, 227, 225));
        jmnuiCir.setForeground(Color.blue);
        jmnuiCua.setBackground(new Color(218, 227, 225));
        jmnuiCua.setForeground(Color.blue);
                
        jmnuPoligono.setEnabled(false);                
        jmnuiCerrar.setEnabled(false);        
        
        // Permite hacer click a cada elemento
        jmnuiIniciar.addActionListener(this);
        jmnuiCerrar.addActionListener(this);
        jmnuiSalir.addActionListener(this);        
        jmnuiRect.addActionListener(this);
        jmnuiCir.addActionListener(this);
        jmnuiCua.addActionListener(this);
        
        jsep1 = new JSeparator();
        
        jmnuArchivo.add(jmnuiIniciar);
        jmnuArchivo.add(jmnuiCerrar);        
        jmnuArchivo.add(jsep1);        
        jmnuArchivo.add(jmnuiSalir);
        
        jmnuPoligono.add(jmnuiRect);
        jmnuPoligono.add(jmnuiCir);
        jmnuPoligono.add(jmnuiCua);
        
        jmnubBarra.add(jmnuArchivo);
        jmnubBarra.add(jmnuPoligono);
               
        this.setJMenuBar(jmnubBarra);
    }
    
    public void prepararPanelFondo(){
        jpanFondo = new JPanel();
        jpanFondo.setLayout(new CardLayout());
        jpanFondo.setBackground(Color.yellow);
        jpanFondo.setBounds(0,0,600,400);
        
        this.add(jpanFondo); 
    }
    
    public void prepararPanelLimpiar(){
        jpanLimpiar = new JPanel();        
        jpanLimpiar.setBackground(Color.white);
        
        jpanFondo.add(jpanLimpiar,"Limpiar");
    }
    
    public void prepararPanelDibujo(){
        jpanDibu = new jpanDibujo();
        jpanFondo.add(jpanDibu,"Dibujo");
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jmnuiIniciar){
            jmnuPoligono.setEnabled(true);                
            jmnuiIniciar.setEnabled(false);    
            jmnuiCerrar.setEnabled(true);    
            ((CardLayout)jpanFondo.getLayout()).show(jpanFondo,"Limpiar");            
        }
        
        if(e.getSource()==jmnuiCerrar){
            jmnuPoligono.setEnabled(false);                
            jmnuiIniciar.setEnabled(true);    
            jmnuiCerrar.setEnabled(false);    
            ((CardLayout)jpanFondo.getLayout()).show(jpanFondo,"Limpiar");
            }
                
        if(e.getSource()==jmnuiSalir){
            System.exit(0);
        }
        
        if(e.getSource()==jmnuiRect){
            jpanDibu.setNombre("RECTANGULO");            
            jpanDibu.repaint();
            ((CardLayout)jpanFondo.getLayout()).show(jpanFondo,"Dibujo");            
        }
        
        if(e.getSource()==jmnuiCir){
            jpanDibu.setNombre("CIRCULO");   
            jpanDibu.repaint();
            ((CardLayout)jpanFondo.getLayout()).show(jpanFondo,"Dibujo");            
        }
        
        if(e.getSource()==jmnuiCua){
            jpanDibu.setNombre("CUADRADO");            
            jpanDibu.repaint();
            ((CardLayout)jpanFondo.getLayout()).show(jpanFondo,"Dibujo");            
        }
        
    }
    
    public static void main(String args[]){
        jclsInicio I = new jclsInicio();
    }
}