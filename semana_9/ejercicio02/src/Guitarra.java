
public class Guitarra extends Instrumento {
    @Override
    public void tocar() {
	System.out.println("Guitarra.tocar()");
    }

    @Override
    public String tipo() { 
             return "Guitarra"; 
    }

    @Override
    public void afinar() { }
}