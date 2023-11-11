package hospital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
	private String nombre;
	
	private ArrayList<Médico> medicos;
	private ArrayList<Paciente> pacientes;
	
	public Hospital(String nombre, ArrayList<Médico> medicos, ArrayList<Paciente> pacientes) {
		super();
		this.nombre = nombre;
		this.medicos = medicos;
		this.pacientes = pacientes;
	}

	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", medicos=" + medicos + ", pacientes=" + pacientes + "]";
	}
	
	public void imprimirPacientes() {
		for (Paciente paciente : pacientes) {
			System.out.println("Posición "+(pacientes.indexOf(paciente)+1) + ", Nombre: "+paciente.getNombre());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Médico> getMédicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Médico> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void añadirPacientes(Paciente paciente) {
		pacientes.add(paciente);
	}
	
	public void eliminarPacientes(int numeroPaciente) {
		pacientes.remove(numeroPaciente);
	}
	
	public double elementoMasComun(double[] a)
	{
	  int count = 1, tempCount;
	  double popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = (int) a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return popular;
	}
	
	public double buscarPesoMenor() {
    	List<Paciente> pacientesOrdenados=new ArrayList<Paciente>();
		pacientesOrdenados=pacientes.stream().sorted(Comparator.comparingDouble(Paciente::getPeso)).collect(Collectors.toList());
		return pacientesOrdenados.get(0).getPeso();
	}
	public double buscarPesoMayor() {
    	List<Paciente> pacientesOrdenados=new ArrayList<Paciente>();
		pacientesOrdenados=pacientes.stream().sorted(Comparator.comparingDouble(Paciente::getPeso)).collect(Collectors.toList());
		return pacientesOrdenados.get(pacientesOrdenados.size()-1).getPeso();
	}
	
	public void ordenarPacientesPorNombre() {
    	List<Paciente> pacientesOrdenados=new ArrayList<Paciente>();
		pacientesOrdenados=pacientes.stream().sorted(Comparator.comparing(Paciente::getNombre)).collect(Collectors.toList());
		System.out.println(pacientesOrdenados);
		
	}	
	public void añadirMedicos(Médico medico) {
		medicos.add(medico);
	}
}
