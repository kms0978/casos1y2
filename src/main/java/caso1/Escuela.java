import java.util.*;

public class Escuela {

	private ArrayList<Estudiante> estudiantes;
	private String nombreEscuela;
	Collection<Estudiante> estudiante;

	public ArrayList<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}

	/**
	 * 
	 * @param estudiantes
	 */
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getNombreEscuela() {
		return this.nombreEscuela;
	}

	/**
	 * 
	 * @param nombreEscuela
	 */
	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}

	/**
	 * 
	 * @param estudiantes
	 */
	public Escuela(ArrayList<Estudiante> estudiantes) {
		// TODO - implement Escuela.Escuela
		throw new UnsupportedOperationException();
	}

}