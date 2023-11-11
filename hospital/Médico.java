package hospital;

public class Médico {

	private int nroDeColegiatura;
	private String nombre;
	private String especialidad;
	
	public Médico(int nroDeColegiatura, String nombre, String especialidad) {
		super();
		this.nroDeColegiatura = nroDeColegiatura;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public int getNroDeColegiatura() {
		return nroDeColegiatura;
	}

	public void setNroDeColegiatura(int nroDeColegiatura) {
		this.nroDeColegiatura = nroDeColegiatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Médicos [nroDeColegiatura=" + nroDeColegiatura + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ "]";
	}
	
	
	}


