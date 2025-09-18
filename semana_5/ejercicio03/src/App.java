import java.util.Scanner;

import modelo.*;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de profesor: ");
        String nombre_tipo = sc.next();
        
        TipoProfesor tipo = new TipoProfesor(nombre_tipo, "A001");
        
        Persona p = new Profesor(40, tipo, "Mathias", "2420014", 20);
        
        System.out.println(p);
        
    }
    
}