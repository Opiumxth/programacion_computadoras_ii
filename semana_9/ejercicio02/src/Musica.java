public class Musica {
    // No importa el tipo de Instrumento,
    // seguirá funcionando debido a Polimorfismo:
    static void afinar(Instrumento i) {
	i.tocar();
    }

    static void afinarTodo(Instrumento[ ] e) {	

        for (Instrumento e1 : e) 
            afinar(e1); // Pasando un instrumento como paramentro
        
    }

    public static void main(String[ ] args) {
	Instrumento[ ] orquesta = new Instrumento[5];
	int i = 0;
	// Up-casting al asignarse el Arreglo
	orquesta[i++] = new Guitarra();
	orquesta[i++] = new Piano();
	orquesta[i++] = new Saxofon();
	orquesta[i++] = new Guzla();
	orquesta[i++] = new Ukelele();
	afinarTodo(orquesta); // Pasando los diferentes instrumentos 
    }
}