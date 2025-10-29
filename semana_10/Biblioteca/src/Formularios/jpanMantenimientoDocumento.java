package Formularios;

//Declaramos las librerias del Java que necesitamos usar
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


import Clases.ArregloDeDocumentos;

//Declaración de la clase 'jpanMantenimientoDocumento' que hereda de un 'jpanFondo'
//e implementa a la interface 'ActionListener'
public abstract class jpanMantenimientoDocumento extends jpanFondo implements ActionListener{
	//Declaración de Atributos
	//Declaración de componentes gráficos swing para crear la GUI
	protected JToolBar jtoobBarra;
	protected JButton jbtnNuevo, jbtnGrabar, jbtnMostrar, jbtnActivar, jbtnInactivar;
	protected JButton jbtnSalir;
	protected JLabel jlblCabecera, jlblCodigo, jlblTitulo, jlblDescripcion;
	protected JLabel jlblAutor, jlblAño, jlblFecha, jlblCantidad, jlblEstado, jlblImagenEstado;
	protected JTextField jtxfCodigo, jtxfTitulo, jtxfAutor;
	protected JTextField jtxfAño, jtxfFecha, jtxfCantidad, jtxfEstado; 
	protected JTextArea jtxaDescripcion;
	protected JScrollPane jscrpanDescripcion;	
	//Declaración del objeto que referenciará al objeto 'jpanelFondo' creado
	//en la clase 'jfrmPrincipal'	
	protected jpanFondo jpanelFondo;
	//Declaramos un atributo que guarde el tipo de Documento
	//pude ser LIBRO, REVISTA, TESIS
	protected String tipoDocumento;
	protected ArregloDeDocumentos arregloRelacionado;
	
	//Constructor por defecto
	public jpanMantenimientoDocumento(){		
		
	}	
		
	//Este es el método constructor por parámetro
	//le llega por parámetro la referencia de un objeto de tipo 'jpanFondo', el
	//tipo de documento, y 'ArregloDeDocumentos'
	//luego invoca o llama al método 'iniciarComponentes()'	 
	public jpanMantenimientoDocumento(jpanFondo jpanelFondo, String tipoDocumento, ArregloDeDocumentos arreglo){
                this.jpanelFondo = jpanelFondo;
		this.tipoDocumento = tipoDocumento;
		this.arregloRelacionado = arreglo;
		iniciarComponentes();		
	}
	
	//Este método instancia los objetos o componentes gráficos
	//que se van a mostrar dentro del JPanel (lienzo)
	public void iniciarComponentes(){
		//Indicamos que el Administrador de Diseño sea nulo
		this.setLayout(null);
		
		//Instanciamos la barra de herramientas llamada 'jtoobBarra'
		//Indicamos su posición y tamaño, color y que no tenga Adm. de Diseño
		jtoobBarra = new JToolBar();
		jtoobBarra.setBounds(0,0,800,40);
		jtoobBarra.setBackground(new Color(70,130,180));
		jtoobBarra.setLayout(null);
		
		//Instanciamos un botón llamado 'jbtnNuevo'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnNuevo = new JButton("Nuevo");
		jbtnNuevo.setIcon(new ImageIcon(rutaDeImagenes+"nuevo.png"));
		jbtnNuevo.setBounds(0,0,119,40);
		jbtnNuevo.addActionListener(this);
		
		//Instanciamos un botón llamado 'jbtnGrabar'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnGrabar = new JButton("Grabar");
		jbtnGrabar.setIcon(new ImageIcon(rutaDeImagenes+"grabar.png"));
		jbtnGrabar.setBounds(120,0,119,40);
		jbtnGrabar.addActionListener(this);
		
		//Instanciamos un botón llamado 'jbtnMostrar'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnMostrar = new JButton("Mostrar");
		jbtnMostrar.setIcon(new ImageIcon(rutaDeImagenes+"mostrar.png"));
		jbtnMostrar.setBounds(240,0,119,40);
		jbtnMostrar.addActionListener(this);
		
		//Instanciamos un botón llamado 'jbtnActivar'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnActivar = new JButton("Activar");
		jbtnActivar.setIcon(new ImageIcon(rutaDeImagenes+"check.png"));
		jbtnActivar.setBounds(360,0,119,40);
		jbtnActivar.addActionListener(this);
                
                //Instanciamos un botón llamado 'jbtnInactivar'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnInactivar = new JButton("Inactivar");
		jbtnInactivar.setIcon(new ImageIcon(rutaDeImagenes+"uncheck.png"));
		jbtnInactivar.setBounds(480,0,119,40);
		jbtnInactivar.addActionListener(this);
		
		//Instanciamos un botón llamado 'jbtnSalir'
		//Indicamos que muestre una imagen
		//Indicamos su posición y tamaño
		//Indicamos que tenga la propiedad de escuchar 
		//los eventos que se originan sobre él
		jbtnSalir = new JButton("Salir");
		jbtnSalir.setIcon(new ImageIcon(rutaDeImagenes+"salir.png"));
		jbtnSalir.setBounds(600,0,119,40);
		jbtnSalir.addActionListener(this);
		
		//Añadimos cada botón a la barra de herramientas
		jtoobBarra.add(jbtnNuevo);
		jtoobBarra.add(jbtnGrabar);
		jtoobBarra.add(jbtnMostrar);
		jtoobBarra.add(jbtnActivar);
		jtoobBarra.add(jbtnInactivar);
		jtoobBarra.add(jbtnSalir);
					
		//Añadimos la barra de herramientas al JPanel 'jpanMantenimientoDocumento'
		this.add(jtoobBarra);	
		
		//********************************************************
		//Creamos la GUI para el registro de datos de un Documento
		//********************************************************		
		//Instanciamos objetos de tipo JLabel (etiqueta), JTextField (caja de texto),
		//JTextArea (Area de texto) y JScrollPane
		//Indicamos el texto a mostrar
		//Indicamos la posición y tamaño de cada componente gráfico dentro del JPanel
		jlblCabecera = new JLabel("Mantenimiento de " + tipoDocumento);
		jlblCabecera.setBounds(250,110,200,20);
		
		jlblCodigo = new JLabel("Código:");
		jlblCodigo.setBounds(250,140,100,20);
			
		jlblTitulo = new JLabel("Título:");
		jlblTitulo.setBounds(250,170,100,20);
			
		jlblDescripcion = new JLabel("Descripción:");
		jlblDescripcion.setBounds(250,200,100,60); 
		
		jlblAutor = new JLabel("Autor:");
		jlblAutor.setBounds(250,270,100,20); 
			
		jlblAño = new JLabel("Año:");
		jlblAño.setBounds(250,300,100,20);
		
		jlblFecha = new JLabel("Fecha:");
		jlblFecha.setBounds(250,330,100,20); 
		
                jlblCantidad = new JLabel("Cantidad:");
		jlblCantidad.setBounds(250,360,100,20); 
		
		jlblEstado = new JLabel("Estado:");
		jlblEstado.setBounds(250,390,100,20); 
		
		jtxfCodigo = new JTextField();
		jtxfCodigo.setBounds(350,140,100,20);
		
		jtxfTitulo = new JTextField();
		jtxfTitulo.setBounds(350,170,100,20);
		
		jtxaDescripcion = new JTextArea();
		jscrpanDescripcion = new JScrollPane( jtxaDescripcion ); 
		jscrpanDescripcion.setBounds(350,200,200,60);
		
		jtxfAutor = new JTextField();
		jtxfAutor.setBounds(350,270,100,20);
	
		jtxfAño = new JTextField();
		jtxfAño.setBounds(350,300,100,20);
		
		jtxfFecha = new JTextField();
		jtxfFecha.setBounds(350,330,100,20);
		
		jtxfCantidad = new JTextField();
		jtxfCantidad.setBounds(350,360,100,20);
				
		jlblImagenEstado = new JLabel("Activo");
		jlblImagenEstado.setIcon(new ImageIcon(rutaDeImagenes+"check.png"));
		jlblImagenEstado.setBounds(350,390,100,20);
		
		//Añadimos cada componente gráfico swing dentro del JPanel
		this.add(jlblCabecera);
		this.add(jlblCodigo);
		this.add(jlblTitulo);
		this.add(jlblDescripcion);
		this.add(jlblAutor);
		this.add(jlblAño);
		this.add(jlblFecha);
		this.add(jlblCantidad);
		this.add(jlblEstado);		
		this.add(jtxfCodigo);
		this.add(jtxfTitulo);
		this.add(jscrpanDescripcion);
		this.add(jtxfAutor);
		this.add(jtxfAño);
		this.add(jtxfFecha);
		this.add(jtxfCantidad);
		this.add(jlblImagenEstado);				
	}
	
	//Este método colocará una cadena vacía a cada componente gráfico
	//con esto logramos limpiar los datos ingresados y asi poder
	//ingresar nuevos datos
	public void limpiarFormulario(){
		jtxfCodigo.setText("");
		jtxfTitulo.setText("");
		jtxaDescripcion.setText("");
                jtxfAutor.setText("");
		jtxfAño.setText("");
		jtxfFecha.setText("");
		jtxfCantidad.setText("");
		jlblImagenEstado.setIcon(new ImageIcon(rutaDeImagenes+"check.png"));
	}
	
	//Este método valida si el usuario ha ingresado algun dato en la caja de texto
	//correspondiente al código, este método es importante, porque todas las 
	//opereaciones necesitan que se ingrese el dato en la caja CODIGO
	public boolean validarIngresoDelCampoCodigoDelFormulario(){		
		if(jtxfCodigo.getText().trim().length()==0){
			JOptionPane.showMessageDialog(null,"Ingrese el código.", "Validando el Formulario", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
			
	//Este método valida cada componente gráfico swing, verifica si algun componente
	//esta vacio, si es asi, mostrará un mensaje indicando que se ingrese el dato
	//si todo está lleno se devolverá el valor de 'true'
	//si algún componente no está lleno se devolverá el valor de 'false'
	public boolean  validarDatosDelFormulario(){
		boolean valor = true;
		String mensaje = "mensaje";
		
		if(jtxfCodigo.getText().trim().length()==0){
			mensaje = "Ingrese el código.";
			valor = false;
		}else if(jtxfTitulo.getText().trim().length()==0){
			mensaje = "Ingrese el título.";
			valor = false;
		}else if(jtxaDescripcion.getText().trim().length()==0){
			mensaje = "Ingrese la descripción.";
			valor = false;
		}else if(jtxfAutor.getText().trim().length()==0){
			mensaje = "Ingrese el autor.";
			valor = false;
		}else if(jtxfAño.getText().trim().length()==0){
			mensaje = "Ingrese el año.";
			valor = false;
		}else if(jtxfFecha.getText().trim().length()==0){
			mensaje = "Ingrese la fecha.";
			valor = false;
		}else if(jtxfCantidad.getText().trim().length()==0){
			mensaje = "Ingrese la cantidad.";
			valor = false;
		}
		
		if(!valor){
			JOptionPane.showMessageDialog(null,mensaje, "Validando el Formulario", JOptionPane.WARNING_MESSAGE);
		}
		
		return valor;
	}
        //Este método detecta los eventos de tipo ACTION generados en los componentes
	//gráficos swing. Siempre y cuando dichos componentes tengan habilitado su
	//propiedad 'addActionListener(this)'
        @Override
	public void actionPerformed(ActionEvent e){		
		if(e.getSource() == jbtnNuevo){
			limpiarFormulario();
		}
		if(e.getSource() == jbtnGrabar){
			accionDelBotonGrabar();
		}
		if(e.getSource() == jbtnMostrar){
			accionDelBotonMostrar();
		}
		if(e.getSource() == jbtnActivar){
			accionDelBotonActivar();
		}
		if(e.getSource() == jbtnInactivar){
			accionDelBotonInactivar();
		}
		if(e.getSource() == jbtnSalir){
			//Cambiamos de 'JPanel', ahora mostramos a 'jpanInicio'	
			((CardLayout)jpanelFondo.getLayout()).show( jpanelFondo,"inicio" ); 
		}
	}
	
	//****************************************************************
	//Estos métodos se invocarán cuando se haga clic sobre los botones
	//de la barra de herramientas
	//OBSERVACION:
	//Es código interno de cada método, será implementada por las clases HIJAS
	//por que se está invocando a un MÉTODO ABSTRACTO, y como es bien
	//conocido, las clases HIJAS son las encargadas de implementar a cada 
	//MÉTODO ABSTRACTO defino en la clase PADRE.
	
	public void accionDelBotonGrabar(){
		if(validarDatosDelFormulario()){
			grabarDocumento(); //MÉTODO ABSTRACTO 
			limpiarFormulario();
		}
	}
	
	public void accionDelBotonMostrar(){		
		if(validarIngresoDelCampoCodigoDelFormulario()){		
			mostrarDocumento(); //MÉTODO ABSTRACTO 
		}		
	}
	
	public void accionDelBotonActivar(){		
		if(validarIngresoDelCampoCodigoDelFormulario()){		
			activarDocumento(); //MÉTODO ABSTRACTO 
		}		
	}
	
	public void accionDelBotonInactivar(){		
		if(validarIngresoDelCampoCodigoDelFormulario()){		
			inactivarDocumento(); //MÉTODO ABSTRACTO 
		}		
	}

	//****************************************************************
	//Declaración de los MÉTODOS ABSTRACTOS 
	public abstract void grabarDocumento();
	public abstract void mostrarDocumento();
	public abstract void activarDocumento();
	public abstract void inactivarDocumento();
}