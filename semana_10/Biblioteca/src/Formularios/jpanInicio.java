package Formularios;

//Declaramos las librerias del Java que necesitamos usar
import javax.swing.JLabel;
import javax.swing.ImageIcon;

//Declaración de la clase 'jpanInicio' que hereda de un 'jpanFondo'
public class jpanInicio extends jpanFondo{
    //Declaración de Atributos
    //Declaración de componentes gráficos swing para crear la GUI
    private JLabel jlblImagen;
    private JLabel jlblTitulo;

    //Este es el método constructor por defecto
    //Invoca o llama al método 'iniciarComponentes()'	 
    public jpanInicio(){
        iniciarComponentes();
    }	

    //Este método instancia los objetos o componentes gráficos
    //que se van a mostrar dentro del JPanel (lienzo)
    public void iniciarComponentes(){
        //Indicamos que el Administrador de Diseño sea nulo
        this.setLayout(null);

        //Instanciamos dos objetos de tipo JLabel
        this.jlblImagen = new JLabel();
        this.jlblTitulo = new JLabel();

        //Instanciamos dos objetos de tipo 'ImageIcon'
        //Estos objetos cargarán una imagen respectivamente
        ImageIcon iconoImagen = new ImageIcon(rutaDeImagenes+"estudiando.gif");
        ImageIcon iconoTitulo = new ImageIcon(rutaDeImagenes+"logoBiblioteca.jpg");

        //Indicamos a cada objeto de tipo 'JLabel' cargar al objeto de tipo
        //'ImageIcon', de esta forma la imagen se mostrará en el 'JLabel' 
        this.jlblImagen.setIcon(iconoImagen);			
        this.jlblImagen.setBounds(250,80,320,320);

        this.jlblTitulo.setIcon(iconoTitulo);			
        this.jlblTitulo.setBounds(100,400,600,100);

        //Añadimos cada objeto de tipo 'JLabel' dentro del JPanel 'jpanInicio'
        this.add(jlblImagen);
        this.add(jlblTitulo);		
    }
}