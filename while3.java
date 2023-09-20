package cursojava_repeticao;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int conta = 0;
		int contg = 0;
		int contd = 0;
		
		System.out.println("Qual combustível você gostaria de usar? 1=Alcool; 2=Gasolina; 3=Diesel; 4=Encerra");
		int cod = sc.nextInt();
		
		while (cod != 4) {
			if(cod == 1) {
				conta++;						
			} else if(cod == 2) {
				contg++;
			} else if(cod == 3) {
				contd++;
			}	
			System.out.println("Qual combustível você gostaria de usar? 1=Alcool; 2=Gasolina; 3=Diesel; 4=Encerra");
			cod = sc.nextInt();	
		}
		
		System.out.printf("MUITO OBRIGADO \nAlcool: " + conta + "\nGasolina: " + contg + "\nDiesel: "+contd);
		
		sc.close();

	}

}
