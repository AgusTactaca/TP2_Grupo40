package fi.unju.edu.ar;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio15 {
	
	public String NombredelaPersona;
	public String FechadeNacimiento;
	
	public int CalcularEdad(int dia, int mes, int anio) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
		
		return periodo.getYears();
	
	}
	
	public String CalcularSignoZodiaco(int dia, int mes) {
		String signo = null;
		switch (mes) {
		case 1: //Enero
			if (dia>=21)
				signo = "Acuario";
			else
				signo = "Capricornio";
			break;
		case 2: //Febrero
			if (dia>=20)
				signo = "Piscis";
			else
				signo = "Acuario";
			break;
		case 3: //Marzo
			if (dia>=21)
				signo = "Aries";
			else
				signo = "Piscis";
			break;
		case 4: //Abril
			if (dia>=21)
				signo = "Taurus";
			else
				signo = "Aries";
			break;
		case 5: //Mayo
			if (dia>=21)
				signo = "Geminis";
			else
				signo = "Taurus";
			break;
		case 6: //Junio
			if (dia>=22)
				signo = "Cancer";
			else
				signo = "Gemini";
			break;
		case 7: //Julio
			if (dia>=22)
				signo = "Leo";
			else
				signo = "Cancer";
			break;
		case 8: //Agosto
			if (dia>=24)
				signo = "Virgo";
			else
				signo = "Leo";
			break;
		case 9: //Septiembre
			if (dia>=24)
				signo = "Libra";
			else
				signo = "Virgo";
			break;
		case 10: //Octubre
			if (dia>=23)
				signo = "Escorpio";
			else
				signo = "Libra";
			break;
		case 11: //Noviembre
			if (dia>=23)
				signo = "Sagittarius";
			else
				signo = "Escorpio";
			break;
		case 12: //Diciembre
			if (dia>=22)
				signo = "Capricornus";
			else
				signo = "Sagittarius";
			break;
		}
		return signo;
	}
	
	public String CalcularEstacion(int dia, int mes) {
		String estacion = null;
		switch (mes) {
		case 1:
			estacion = "Verano";
			break;
		case 2:
			estacion = "Verano";
			break;
		case 3:
			if (dia >= 21)
				estacion = "Otonio";
			else
				estacion = "Verano";
			break;
		case 4:
			estacion = "Otonio";
			break;
		case 5:
			estacion = "Otonio";
			break;
		case 6:
			if (dia >= 21)
				estacion = "Invierno";
			else
				estacion = "Otonio";
			break;
		case 7:
				estacion = "Invierno";
			break;
		case 8:
				estacion = "Invierno";
			break;
		case 9:
			if (dia >= 21)
				estacion = "Primavera";
			else
				estacion = "Invierno";
			break;
		case 10:
			estacion = "Primavera";
			break;
		case 11:
			estacion = "Primavera";
			break;
		case 12:
			if (dia >= 21)
				estacion = "Verano";
			else
				estacion = "Primavera";
			break;
		}
		
		return estacion;
	}
}
