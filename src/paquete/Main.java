package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int altura;
	int peso;
	boolean gordo;
	int imc;
	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Introduce tu altura en cm");
	altura = scan.nextInt();
	System.out.println("Introduce tu peso en kg");
	peso = scan.nextInt();
	
	
	altura = altura/10;
	imc = peso/(altura^2);
	
	if(imc<5){
		System.out.println("Estás flaquito");
		gordo = false;
	}else{
		System.out.println("Estás gordito");
		gordo = true;
	}
	}

}
