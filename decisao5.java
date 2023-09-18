import java.util.Locale;
import java.util.Scanner;

public class decisao5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int cod, qt;
		double preco;
		
		System.out.println("Digite o código do item desejado: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		qt = sc.nextInt();
		
		if (cod == 1) {
			preco = qt*4;
		}
		else if (cod == 2) {
			preco = qt*4.5;
		} 
		else if (cod == 3) {
			preco = qt*5;
		} 
		else if (cod == 4) {
			preco = qt*2;
		} 
		else {
			preco = qt*1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();
		
	}

}
