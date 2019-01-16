import java.awt.Color;

public class Coche {
	
	private static int cont = 0;
	
	private String modelo;
	private int potencia;
	private Color color;
	
	public Coche(){
		cont++;
		modelo = "focus";
		potencia = 100;
		color = Color.WHITE;		
	}
	
	public Coche(String m, int p) {
		cont++;
		this.modelo = m;
		this.potencia = p;
		color = Color.WHITE;
	}
	
	public Coche(String m, int p, Color c) {
		cont++;
		modelo = m;
		potencia = p;
		color = c;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) throws Exception {
		if (potencia < 1) {
			throw new Exception("Potencia incorrecta");
		}
		else {
			this.potencia = potencia;
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static int getCont() {
		return cont;
	}
	
}
