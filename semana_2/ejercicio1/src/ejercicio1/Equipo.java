package ejercicio1;

import java.util.Scanner;

public class Equipo {
    Scanner sc = new Scanner(System.in);
    
    private String club;
    private String dt;
    private String presidente;   
    private String estadio;
    private int puntos;

    public Equipo() {
        club = "";
        dt = " ";
        presidente = " ";
        estadio = " ";
        puntos = 0;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void ingresarDatos(){
        System.out.print("Ingrese el nombre del club: ");
        setClub(sc.nextLine());
        System.out.print("Ingrese el nombre del director tecnico: ");
        setDt(sc.nextLine());
        System.out.print("Ingrese el nombre del presidente: ");
        setPresidente(sc.nextLine());
        System.out.print("Ingrese el nombre del estadio: ");
        setEstadio(sc.nextLine());
        System.out.print("Ingrese los puntos del equipo: ");
        setPuntos(sc.nextInt());    
    }
    
    public void mostrarDatos(){
        System.out.println(getPuntos() + "\t" + getClub());
    }
    
}