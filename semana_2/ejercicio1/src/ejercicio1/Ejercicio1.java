package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de equipos en el campeonato: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Equipo[] e1;
        e1 = new Equipo[n];
        
        // Instanciando los equipos uno por uno y llenando los datos
        for(int i = 0; i < n; i++){
            e1[i] = new Equipo();
            System.out.println("\nEquipo ["+(i+1)+"]");
            e1[i].ingresarDatos();
        }
        
        ordenarEquipos(e1);
        
        System.out.println("\n+~~~~TABLA DE POSICIONES~~~~+");
        System.out.println("PUNTAJE \t CLUB");
        for(int i = 0; i < n; i++){
            e1[i].mostrarDatos();
        }
    }
    
    public static void ordenarEquipos(Equipo equipos[]){
        int n = equipos.length;
        Equipo aux;
        
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(equipos[j].getPuntos() < equipos[j+1].getPuntos()){
                    aux = equipos[j];
                    equipos[j] = equipos[j+1];
                    equipos[j+1] = aux;
                }
            }
        }
    }
}