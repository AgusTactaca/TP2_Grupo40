package fi.unju.edu.ar.ejercicio16;


public class Calculos {
	public int n;
	
	public double CalcularSumatoria(int n) {
		double resultado = 0;
		this.n = n;
		int k = n;
		for (int i = 0; i < n; i++) {
			resultado = resultado + Math.pow((k*(k+1)/2),2);
			k = k-1;  
		}
		return resultado;
	}
	
	public double CalcularProductoria(int n) {
		double resultado = 1;
		this.n = n;
		int k = n;
		for (int i = 0; i < n; i++) {
			resultado = resultado * (k*(k+4));	
			k = k-1;
		}
		return resultado;
	}
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
}
