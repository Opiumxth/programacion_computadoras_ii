package modelo;

public class OperacionMatematica {
    private int operador1;
    private int operador2;
    private int calculo;
    
    public int getCalculo(){
        return this.calculo;
    }
    
    public void setOperador1(int operador1){
        this.operador1 = operador1;
    }
    
    public void setOperador2(int operador2){
        this.operador2 = operador2;
    }
    
    public void sumar(){
        calculo = operador1 + operador2;
    }
    
    public void multiplicar(){
        calculo = operador1 * operador2;
    }
    
    public void dividir(){
        calculo = operador1 / operador2;
    }
    
}
