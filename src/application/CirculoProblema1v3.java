package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculatorv1;

public class CirculoProblema1v3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculatorv1 calc = new Calculatorv1();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);
		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();

	}

}