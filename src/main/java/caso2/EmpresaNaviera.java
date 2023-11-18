import java.util.*;

package caso2;
public class EmpresaNaviera {

	private String nombreEmpresa;
	private Collection<List<Despartamento>> departamentos;

	public EmpresaNaviera(String nombreEmpresa, List<Departamento> departamentos) {
		this.nombreEmpresa = nombreEmpresa;
		this.departamentos = departamentos;
	}

	public void ingresarEmpresa() {
		Scanner entrada = new Scanner(System.in);
		nombreEmpresa = entrada.nextLine();
	}

	public void agregarDepartamentos() {
	}

	public void eliminarDepartamentos() {

	}

	public void mostrarInformacionEmpresa() {

	}

}