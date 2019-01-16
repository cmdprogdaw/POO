import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		System.out.println("Contador" + Coche.cont);
		Coche ferrari;
		ferrari = new Coche("focus", 700, Color.WHITE); //new retorna la dirección de memoria donde se ha creado ese objeto(Coche), ahora mismo el coche esta referenciado y guardado en ferrari
		Coche ford;
		ford = new Coche("Mondeo", 140, Color.BLUE); //este ford aunque sea del mismo tipo esta en otro trozo de memoria
		Coche.cont = 10;
	}
}
