package Formularios;

//Declaramos las librerias del Java que necesitamos usar
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.CardLayout;

//Importamos la clase 'ArregloDeDocumentos', que se encuentra en otro paquete
import Clases.ArregloDeDocumentos;

//Declaración de la clase 'jfrmPrincipal' que hereda de un 'JFrame'
public class jfrmPrincipal extends JFrame{
	//Declaración de Atributos
	//Declaración de componentes gráficos swing para crear la GUI
	private jpanFondo jpanelFondo;
	private jpanBarraDeMenu jpanelBarra;
	private jpanInicio jpanelInicio;
	private jpanValidarUsuario jpanelValidarUsuario;
	private jpanMantenimientoLibro jpanelMantLibro;
	private jpanMantenimientoRevista jpanelMantRevista;
	private jpanMantenimientoTesis jpanelMantTesis;
	//Declaración del objeto que referenciará a la zona de memoria donde se
	//está guardando los objetos de tipo Documento  
	private ArregloDeDocumentos arregloRelacionado;
	
	//Este es el método constructor por parámetro
	//le llega por parámetro la referencia de un objeto de tipo 'ArregloDeDocumentos'
	//luego invoca o llama al método 'iniciarComponentes()'	 
	public jfrmPrincipal(ArregloDeDocumentos arreglo){
		//Referenciamos al objeto creado en el método 'main'
		this.arregloRelacionado = arreglo;
		iniciarComponentes();
	}
	
	//Este método instancia los objetos o componentes gráficos
	//que se van a mostrar dentro del JFrame (marco o contorno)
	public void iniciarComponentes(){
		//Indicamos el título del formulario
		this.setTitle("Sistema de Biblioteca");
		//Indicamos el tamaño del formulario
		this.setSize(800,600);
		//Desactivamos el boton Maximizar
		this.setResizable(false);
		//Llamamos al método que centra la ventana 'jfrmPrincipal'
		centrarVentana();	
		//Indicamos que no tenga Administrador de Diseño
		this.setLayout(null);
                
                //Instanciamos el JPanel 'jpanelFondo'
		jpanelFondo = new jpanFondo();
		//Indicamos la posición y tamaño que tendrá dentro del formulario
		jpanelFondo.setBounds(0,50,800,550);
		//Indicamos que el Administrador de Diseño del JPanel 'jpanelFondo' sea
		//de tipo 'CardLayout'. Lo que significa que va a contener a otros JPanel
		//Es decir se van a colocar cada JPanel tras otro JPanel, como si fueran Naipes 
		jpanelFondo.setLayout(new CardLayout());
		
		//Instanciamos al 'JPanel' que contendrá a la Barra de Menu
		//Enviamos por parámetro la REFERENCIA del JPanel 'jpanelFondo' 
		//para que dentro de la clase 'jpanelBarra' se pueda invocar a 'jpanelFondo' 
		jpanelBarra = new jpanBarraDeMenu(jpanelFondo);
		jpanelBarra.setBounds(0,0,800,50);
		
		//Instanciamos al 'JPanel' que mostrará dos imágenes
		jpanelInicio = new jpanInicio();
		jpanelInicio.setBounds(0,0,800,600);
		
		//Instanciamos al 'JPanel' que validará el ingreso de un nuevo usuario
		//Enviamos por parámetro la REFERENCIA del JPanel 'jpanelBarra' y 'jpanelFondo'  
		//para que dentro de la clase 'jpanelValidarUsuario' se pueda invocar a los
		//métodos de 'jpanelBarra' y 'jpanelFondo'  
		jpanelValidarUsuario = new jpanValidarUsuario(jpanelBarra,jpanelFondo);
		jpanelValidarUsuario.setBounds(0,0,800,600);
		
		//Instanciamos al 'JPanel' que registrará el ingreso de un nuevo libro
		//Enviamos por parámetro la REFERENCIA del JPanel 'jpanelFondo' y 'arregloRelacionado'  
		//para que dentro de la clase 'jpanelMantLibro' se pueda invocar a los
		//métodos de 'jpanelFondo' y 'arregloRelacionado'  
		jpanelMantLibro = new jpanMantenimientoLibro(jpanelFondo,"Libro",arregloRelacionado);
		jpanelMantLibro.setBounds(0,0,800,600);
		
		//PARA IMPLEMENTAR...
		//Instanciamos al 'JPanel' que registrará el ingreso de una nueva revista
		//Enviamos por parámetro la REFERENCIA del JPanel 'jpanelFondo' y 'arregloRelacionado'  
		//para que dentro de la clase 'jpanelMantRevista' se pueda invocar a los
		//métodos de 'jpanelFondo' y 'arregloRelacionado'  
		jpanelMantRevista = new jpanMantenimientoRevista(jpanelFondo,"Revista",arregloRelacionado);
		jpanelMantRevista.setBounds(0,0,800,600);
		
		//PARA IMPLEMENTAR...
		//Instanciamos al 'JPanel' que registrará el ingreso de una nueva revista
		//Enviamos por parámetro la REFERENCIA del JPanel 'jpanelFondo' y 'arregloRelacionado'  
		//para que dentro de la clase 'jpanelMantTesis' se pueda invocar a los
		//métodos de 'jpanelFondo' y 'arregloRelacionado'  
		jpanelMantTesis = new jpanMantenimientoTesis(jpanelFondo,"Tesis",arregloRelacionado);
		jpanelMantTesis.setBounds(0,0,800,600);
		
		//Añadimos cada JPanel al 'jpanelFondo'
		//Aca funciona el CardLayout, el cual colocará a ca JPanel uno tras otro
		//Es decir primero estará 'jpanelInicio' y tras este estará 'jpanelValidarUsuario'
		//y asi sucesivamente, el último en colocarse es 'jpanelMantTesis'		
		jpanelFondo.add("inicio", jpanelInicio);
		jpanelFondo.add("usuario", jpanelValidarUsuario);
		jpanelFondo.add("libro", jpanelMantLibro);
		jpanelFondo.add("revista", jpanelMantRevista);
		jpanelFondo.add("tesis", jpanelMantTesis);
                
                //Añadimos al JPanel 'jpanelBarra' y 'jpanelFondo' dentro del formulario
		this.add(jpanelBarra);
		this.add(jpanelFondo);		
		
		//Indicamos que al cerrar la ventana, se detengan todos los procesos
		//iniciados para esta ventana	
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);	
	}	
	
	//Este método permite centrar la ventana en la pantalla del Monitor
	public void centrarVentana(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		int x = (screenSize.width - frameSize.width)/2;
		int y = (screenSize.height - frameSize.height)/2;
		this.setLocation(x,y);
	}
	
	//Método main
	//Aquí instanciamos al objeto que almacenará a todos los Documentos de mi biblioteca
	//Enviamos por referencia dicho objeto 'arreglo' para que pueda ser usado 
	//dentro de la GUI
	//Recordar que la información debe estar SEPARADA de la GUI (Interface Gráfica de Usuario)
	public static void main(String[] args) {
		ArregloDeDocumentos arreglo = new ArregloDeDocumentos();		
		new jfrmPrincipal(arreglo).setVisible(true);
	}	
}