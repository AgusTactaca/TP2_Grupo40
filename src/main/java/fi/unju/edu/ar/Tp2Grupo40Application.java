package fi.unju.edu.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
@SpringBootApplication
public class Tp2Grupo40Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Grupo40Application.class, args);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dia nacimiento: "); int dia = scanner.nextInt();
		System.out.println("Mes nacimiento: "); int mes = scanner.nextInt();
		System.out.println("Anio nacimiento: "); int anio = scanner.nextInt();
		Ejercicio15 CalculoEdad = new Ejercicio15();
		int edad = CalculoEdad.CalcularEdad(dia, mes, anio);
		System.out.println("Tu edad es: " + edad + " anios");
		Ejercicio15 SignoZodiaco = new Ejercicio15();
		String zodiaco = SignoZodiaco.CalcularSignoZodiaco(dia, mes);
		System.out.println("Tu signo es: " + zodiaco);
		Ejercicio15 Estacion = new Ejercicio15();
		String estacion = Estacion.CalcularEstacion(dia, mes);
		System.out.println("Estacion del anio segun tu fecha de nacimiento: " + estacion);
	}
}
