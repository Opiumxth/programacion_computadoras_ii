package ejercicio2_v2;


public class Empresa {
    Trabajador[] emp;
    
    Empresa(int n){
        emp = new Trabajador[n];
    }

    public void ingresarTrabajadores(int n){
        for(int i = 0; i < n; i++){
            emp[i] = new Trabajador();
            System.out.println("Trabajador ["+(i+1)+"]:");
            emp[i].ingresarDatos();
            System.out.println("---------------");
        }
    }

    public void presentarTrabajadores(int n){
        System.out.println("==TRABAJADORES==");
        for(int i = 0; i < n; i++){
            System.out.println((i+1)+". Para el trabajador "+ emp[i].getNombre()+":");
            System.out.println("\tEl sueldo es de "+emp[i].pagoPorCargo());
        }
    }
}