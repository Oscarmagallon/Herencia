package herencias;

public final class Interinos extends Administrativos {
	private String estudios;

	public Interinos(String nombre, int edad, String cargo, String estudios) {
		super(nombre, edad, cargo);
		this.estudios = estudios;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return "Interinos [estudios=" + estudios + "]";
	}
	
}
