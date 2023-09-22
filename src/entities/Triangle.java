package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() { //isso aqui é uma função. Ela não recebe parâmetros, pois os valores do cálculo já foram declarados acima.
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
}
