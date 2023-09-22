/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class for5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fat = 1;
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
