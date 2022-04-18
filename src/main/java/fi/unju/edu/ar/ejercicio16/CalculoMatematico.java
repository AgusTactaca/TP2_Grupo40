package fi.unju.edu.ar.ejercicio16;

import java.util.Scanner;

public class CalculoMatematico {
	
	public int n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca las veces de repeticiones n: "); int n = scanner.nextInt();
		Calculos Sumatoria = new Calculos();
		double resultadosum = Sumatoria.CalcularSumatoria(n);
		System.out.println("El resultado de la sumatoria es: " + resultadosum);
		Calculos Productoria = new Calculos();
		double resultadopro = Productoria.CalcularProductoria(n);
		System.out.println("El resultado de la productoria es: " + resultadopro);
	}
	
}
