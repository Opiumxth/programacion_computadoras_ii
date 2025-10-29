package Formularios;

//Declaramos las librerias del Java que necesitamos usar
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaración de la clase 'jpanBarraDeMenu' que hereda de un 'jpanFondo'
//e implementa a la interface 'ActionListener'
public class jpanBarraDeMenu extends jpanFondo implements ActionListener{
        //Declaración de Atributos
	//Declaración de componentes gráficos swing para crear la GUI
	private JMenuBar  jmnbBarra;
	private JMenu	  jmnArchivo;
	private JMenuItem jmniEntrar;
	private JMenuItem jmniSalir;
	private JMenu	  jmnMantenimiento;
	private JMenuItem jmniLibro;		
	private JMenuItem jmniRevista;		
	private JMenuItem jmniTesis;
	//Declaración del objeto que referenciará al objeto 'jpanelFondo' creado
	//en la clase 'jfrmPrincipal'
	private jpanFondo jpanelFondo;
	
	//Este es el método constructor por parámetro
	//le llega por parámetro la referencia de un objeto de tipo 'jpanFondo'
	//luego invoca o llama al método 'iniciarComponentes()'	 
	public jpanBarraDeMenu(jpanFondo jpanelFondo){
		this.jpanelFondo = jpanelFondo;
		iniciarComponentes();		
	}
	
	//Este método instancia los objetos o componentes gráficos
	//que se van a mostrar dentro del JPanel (lienzo)
	public void iniciarComponentes(){
		//Indicamos que el Administrador de Diseño sea nulo
		this.setLayout(null);
		
		//Instanciamos a la barra de menú
		//Indicamos su posición y tamaño dentro del JPanel
		jmnbBarra = new JMenuBar();
		jmnbBarra.setBounds(0,0,800,50);
		
		//Instanciamos a un menú que se llamará 'jmnArchivo'
		jmnArchivo = new JMenu("Archivo");
				
		//Instanciamos a un	item del menú llamado 'jmniEntrar'
		//Este item va ir dentro del menú 'jmnArchivo'
		//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jmniEntrar = new JMenuItem("Iniciar");
		jmniEntrar.setIcon(new ImageIcon(rutaDeImagenes+"inicio.png"));
		jmniEntrar.addActionListener(this);
		
		//Instanciamos a un	item del menú llamado 'jmniSalir'
		//Este item va ir dentro del menú 'jmnArchivo'
		//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jmniSalir = new JMenuItem("Cerrar");
		jmniSalir.setIcon(new ImageIcon(rutaDeImagenes+"cerrar.png"));
		jmniSalir.addActionListener(this);
		
		//Añadimos los items al menú 'jmnArchivo'
		//Tambien añadimos un objeto de tipo 'JSeparator'
		//el cual es una línea que separa a dos items del menú
		jmnArchivo.add(jmniEntrar);
		jmnArchivo.add(new JSeparator());
		jmnArchivo.add(jmniSalir);

                //Instanciamos a un menú que se llamará 'jmnMantenimiento'
		jmnMantenimiento = new JMenu("Mantenimiento");
			
		//Instanciamos a un	item del menú llamado 'jmniLibro'
		//Este item va ir dentro del menú 'jmnMantenimiento'
		//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jmniLibro = new JMenuItem("Libro");
		jmniLibro.setIcon(new ImageIcon(rutaDeImagenes+"libro.png"));
		jmniLibro.addActionListener(this);
		
		//Instanciamos a un	item del menú llamado 'jmniRevista'
		//Este item va ir dentro del menú 'jmnMantenimiento'
		//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jmniRevista = new JMenuItem("Revista");
		jmniRevista.setIcon(new ImageIcon(rutaDeImagenes+"revista.png"));
		jmniRevista.addActionListener(this);
		
		//Instanciamos a un	item del menú llamado 'jmniTesis'
		//Este item va ir dentro del menú 'jmnMantenimiento'
		//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jmniTesis = new JMenuItem("Tesis");
		jmniTesis.setIcon(new ImageIcon(rutaDeImagenes+"tesis.png"));
		jmniTesis.addActionListener(this);
		
		//Añadimos los items al menú 'jmnMantenimiento'
		//Tambien añadimos un objeto de tipo 'JSeparator'
		//el cual es una línea que separa a dos items del menú
		jmnMantenimiento.add(jmniLibro);
		jmnMantenimiento.add(new JSeparator());
		jmnMantenimiento.add(jmniRevista);
		jmnMantenimiento.add(new JSeparator());
		jmnMantenimiento.add(jmniTesis);
		
		//Añadimos los menús dentro de la barra
		jmnbBarra.add(jmnArchivo);
		jmnbBarra.add(jmnMantenimiento);
		
		//Desactivamos las opciones del menú
		cambiarEstadoDeLaBarraDeMenu(false);
		
		//Añadimos la barra de menús dentro del JPanel
		this.add(jmnbBarra);			
	}
	
	//Este método activa o desactiva a las opciones del menú
	//según sea el valor de la varible que viene por parámetro
	public void cambiarEstadoDeLaBarraDeMenu(boolean valor){
		jmniEntrar.setEnabled(!valor);
		jmniSalir.setEnabled(valor);
		jmnMantenimiento.setEnabled(valor);
	}
	
	//Este método detecta los eventos de tipo ACTION generados en los componentes
	//gráficos swing. Siempre y cuando dichos componentes tengan habilitado su
	//propiedad 'addActionListener(this)'
        @Override
	public void actionPerformed(ActionEvent e){
                if(e.getSource() == jmniEntrar){
			//Cambiamos de 'JPanel', ahora mostramos a 'jpanValidarUsuario'
			((CardLayout)jpanelFondo.getLayout()).show( jpanelFondo,"usuario" ); 
		}
		if(e.getSource() == jmniSalir){
			//Mostramos una ventana de dialogo que pregunte si deseamos salir 
			int numero = JOptionPane.showConfirmDialog(null,													"Desea SALIR del Sistema",											"Salir",												                          JOptionPane.YES_NO_OPTION);
			if(numero == 0){
				//Si la respuesta fue 'SI', entonces deshabilitamos las opciones del menú				
				cambiarEstadoDeLaBarraDeMenu(false);
			}
		}
		if(e.getSource() == jmniLibro){
			//Cambiamos de 'JPanel', ahora mostramos a 'jpanMantenimientoLibro'			
			((CardLayout)jpanelFondo.getLayout()).show( jpanelFondo,"libro" ); 			
		}
		if(e.getSource() == jmniRevista){
			//Cambiamos de 'JPanel', ahora mostramos a 'jpanMantenimientoRevista'			
			((CardLayout)jpanelFondo.getLayout()).show( jpanelFondo,"revista" ); 			
		}
		if(e.getSource() == jmniTesis){
			//Cambiamos de 'JPanel', ahora mostramos a 'jpanMantenimientoTesis'			
			((CardLayout)jpanelFondo.getLayout()).show( jpanelFondo,"tesis" ); 			
		}
	}
}