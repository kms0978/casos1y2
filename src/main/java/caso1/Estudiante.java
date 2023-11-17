public class Estudiante {

	private String nombre;
	private int edad;
	private Mascota mascota;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Mascota getMascota() {
		return this.mascota;
	}

	/**
	 * 
	 * @param mascota
	 */
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param mascota
	 */
	public Estudiante(String nombre, int edad, Mascota mascota) {
		// TODO - implement Estudiante.Estudiante
		throw new UnsupportedOperationException();
	}

}