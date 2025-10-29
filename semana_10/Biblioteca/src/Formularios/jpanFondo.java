package Formularios;

import javax.swing.JPanel;
import java.awt.Color;

public class jpanFondo extends JPanel {
    //Declaración de Atributos
    //Declaramos un objeto de tipo 'Color'
    protected Color coColorDeFondo;

    //Atributo que almacenará la ruta donde se encuentran las imagenes
    protected String rutaDeImagenes;
	
    //Este es el Método Constructor por defecto
    public jpanFondo(){
        this.setLayout(null);

        //Instanciamos el objeto 'coColorDeFondo'
        //se usan 3 números enteros del rango [0-255]
        //para crear un color en el sistema RGB
        //codigo de colores del color 'lightyellow'
        coColorDeFondo = new Color(255,255,224); 

        //Esta es la ruta por defecto, donde se encuentran las imagenes
        //Esta ruta dependerá de la unidad de disco duro donde se encuentre
        //tu projecto, deberás de modificarla si es necesario
        //rutaDeImagenes = "D:/CURSOS 2008 II/ALGORITMICA II/EjemplosJCreator/Proyecto/src/Biblioteca/Imagenes/";
        rutaDeImagenes = "~/University/programacion_de_computadoras_ii/semana_10/Biblioteca/src/Imagenes";

        //Asignamos el objeto 'coColorDeFondo' como 
        //el color de fondo del jpanFondo
        this.setBackground(coColorDeFondo);		
    }		
}