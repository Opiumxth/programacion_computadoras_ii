package ejercicio01;

public class Complejo implements Comparable<Complejo> {
    private int real;
    private int complejo;
    
    public Complejo(int r, int c){
        this.real = r;
        this.complejo = c;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getComplejo() {
        return complejo;
    }

    public void setComplejo(int complejo) {
        this.complejo = complejo;
    }
    
    public void mostrar(){
        if(complejo > 0){
            System.out.print(real+"+"+complejo+"i");
        }
        else if(complejo < 0){
            System.out.print(real+"-"+complejo+"i");
        }
        else{
            System.out.print(real);
        }
    }
    
    private int modulo(){
        return (int) Math.sqrt(real * real + complejo *complejo);
    }
    
    @Override
    public int compareTo(Complejo c){
        return Double.compare(this.modulo(), c.modulo());
    }
    
    @Override
    public String toString() {
        return real + (complejo >= 0 ? "+" : "") + complejo + "i";
    }
}