package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Alumno[] alu;
        alu=new Alumno[100];
        ArregloAlumno alumnos=new ArregloAlumno(alu,0,100);
        alu[1]=new Alumno("24200014","Mathias","Flores Hoyos","72837993");
        if (alumnos.agregar(alu[1]))
            System.out.println(alumnos);
    }
}
