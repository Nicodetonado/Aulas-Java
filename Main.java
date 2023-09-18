import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner gravar = new Scanner(System.in);
		
		double A, B, C, tri, cir, trap, quad, ret;
		
		System.out.println("Digite o valor de A: ");
		A = gravar.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = gravar.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = gravar.nextDouble();
		
		tri = (A*C)/2;
		cir = C*C*3.14159;
		trap = ((A+B)*C)/2;
		quad = B*B;
		ret = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULIO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		gravar.close();
			
	}

}
