package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class GettersExercExemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		
		//número da conta | nome do titular | valor do depósito ao abrir a conta (sem money = 0) |
		//número da conta (não pode mudar) | titular (pode mudar) | saldo pode mudar (mas não livremente)
		
		
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new	Conta(numConta, nome, depositoInicial);
		}
		else {
			conta = new Conta(numConta, nome);
		}
	
	
		System.out.println("\nAccount data: \n" + conta);
				
		
		System.out.print("\nEnter a deposit value: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Updated account data: \n" + conta);
	
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("Updated account data: \n" + conta);
		
		
		sc.close();
	

	}
}
