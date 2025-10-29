package ejercicio01;

public class Racional implements Comparable<Racional> {
    private int num, den;
    
    public Racional(int a, int b){
        this.num = a;
        this.den = b;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public void mostrar(){
        System.out.println(num+"/"+den);
    }
    
    @Override
    public int compareTo(Racional r){
        double valor1 = (double) this.num / this.den;
        double valor2 = (double) r.num / r.den;
        return Double.compare(valor1, valor2);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
    
}