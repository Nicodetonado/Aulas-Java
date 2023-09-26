package util;

public class CurrencyConverter {
	
	public static double IOF = 1.06;
	
	public static double dollarToReal(double amount, double dollar) {
		return amount * dollar * IOF;
	}	
}