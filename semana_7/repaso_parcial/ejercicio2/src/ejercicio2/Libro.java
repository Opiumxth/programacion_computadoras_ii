package ejercicio2;

import java.util.Scanner;

public class Libro extends Publicacion{
    Scanner sc = new Scanner(System.in);
    
    private int numPaginas;
    
    public Libro(){
        numPaginas = 0;
    }
    
    public Libro(int numPaginas, String titulo, double precio){
        super(titulo, precio);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Numero de paginas: ");
        setNumPaginas(sc.nextInt());
    }
}