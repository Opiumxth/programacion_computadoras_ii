public class Saxofon extends Instrumento {
    @Override
    public void tocar() {
	System.out.println("Saxofon.tocar()");
    }

    @Override
    public String tipo() { 
             return "Saxofon"; 
    }

    @Override
    public void afinar() { }
}