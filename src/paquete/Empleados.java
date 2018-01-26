package paquete;

import java.util.ArrayList;

public class Empleados {
	private String nombre;
	private String apellido;
	private int salario;
	private int salarioAnio;
	ArrayList <Empleados> listaEmpleados = new ArrayList<Empleados>();
	
	public Empleados(String nombre, String apellido, int salario){
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	public int salarioAnualEmpleado(){
		salarioAnio = salario*14;
		return salarioAnio;
	}
	
	public Empleados(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public ArrayList<Empleados> getEmpleados1() {
		return listaEmpleados;
	}
	public void setEmpleados1(ArrayList<Empleados> empleados1) {
		this.listaEmpleados = empleados1;
	}
}
