public class Ukelele extends Guitarra {
    @Override
    public void tocar() {
	System.out.println("Ukelele.tocar()");
    }

    @Override
    public String tipo() { 
          return "Ukelele"; 
    }
}