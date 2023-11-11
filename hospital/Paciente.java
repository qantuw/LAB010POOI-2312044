package hospital;

public class Paciente {

	private int dni;
	private String nombre;
	private String direccion;
	private double peso;
	private double temperatura;
	private Médico medico;
	
	public Paciente(int dni, String nombre, String direccion, double peso, double temperatura) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.peso = peso;
		this.temperatura = temperatura;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", peso=" + peso
				+ ", temperatura=" + temperatura + ", medico=" + medico + "]";
	}
}
	
	
	
	
	

