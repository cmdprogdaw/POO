
public class Main {

	public static void main(String[] args) {
		Coche ferrari = new Coche(); //new retorna la dirección de memoria donde se ha creado ese objeto(Coche), ahora mismo el coche esta referenciado y guardado en ferrari
		ferrari.arrancarMotor();
		Coche ford = new Coche(); //este ford aunque sea del mismo tipo esta en otro trozo de memoria
		ford.arrancarMotor();
	}
}
