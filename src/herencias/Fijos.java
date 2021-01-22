package herencias;

public class Fijos extends Administrativos{
	private String tiempo;

	public Fijos(String nombre, int edad, String cargo, String tiempo) {
		super(nombre, edad, cargo);
		this.tiempo = tiempo;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Fijos [tiempo=" + tiempo + "]";
	}
	
}
