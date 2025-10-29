public class Piano extends Instrumento {
    @Override
    public void tocar() {
	System.out.println("Piano.tocar()");
    }

    @Override
    public String tipo() { 
             return "Piano"; 
    }

    @Override
    public void afinar() { }
}