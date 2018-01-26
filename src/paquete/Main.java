package paquete;

public class Main {

	public static void main(String[] args) {
		Empleados e1 = new Empleados("Juan", "García");
		Empleados e2 = new Empleados("Jorge","Fernández", 1000);
		Empleados e3 = new Empleados("Robert", "Baluta", 1300);
		Empleados e4 = new Empleados("Mauricio", "Diaz", 1200);
		
		final int LISTAR = 1;
		final int AGREGAR = 2;
		final int ELIMINAR = 3;
		final int SALIR = 0;

	}

}
