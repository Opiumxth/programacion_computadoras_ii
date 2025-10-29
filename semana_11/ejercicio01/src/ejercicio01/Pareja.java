package ejercicio01;

public class Pareja <T extends Comparable> {
    T a, b;
    
    public Pareja(T a,T b){
        this.a = a;
        this.b = b;
    }
    
    public T max(){
        return (a.compareTo(b)>0) ? a : b;
    }
    
    public T min(){
        return (a.compareTo(b)<0) ? a : b;
    }
}