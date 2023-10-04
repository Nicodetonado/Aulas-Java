package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class GettersExerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int escolha = 1;
		
		
		//número da conta | nome do titular | valor do depósito ao abrir a conta (sem money = 0) |
		//número da conta (não pode mudar) | titular (pode mudar) | saldo pode mudar (mas não livremente)
		
		
		
		System.out.println("Vamos cadastrar a sua conta... \nPor gentileza, digite o seu nome completo: ");
		String nome = sc.nextLine();
		System.out.println("Você gostaria de realizar um depósito inicial? Digite '1' para SIM, ou '2' para NÃO");
		int resposta = sc.nextInt();
		double valor = 0;
		int numConta = 1561564;
		Conta conta = new Conta(numConta, nome, valor);
		
		if (resposta == 1) {
			System.out.println("Digite o valor que gostaria de depositar: ");
			valor = sc.nextDouble();
			conta.deposito(valor);
		} 
		
		
		while (escolha != 3) {
			System.out.println("\nNúmero da conta: " + conta.getNumConta() + "\nNome do Titulas: " + conta.getNome() + "\nValor em conta: " + conta.getValor() + "\n");
			System.out.println("Digite '1' para DEPÓSITO ou '2' para SAQUE ou '3' para ENCERRAR");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.println("Qual o valor que deseja Depositar?");
				valor = sc.nextDouble();
				conta.deposito(valor);
			} else if (escolha == 2) {
				System.out.println("Qual o valor que deseja Sacar? *Lembre-se de que há uma taxa de $5.00 por saque*");
				valor = sc.nextDouble();
				conta.saque(valor);
			} else if (escolha == 3) {
				System.out.println("Obrigado pelo seu tempo!");
				sc.close();
			} else {
				System.out.println("ERRO: Valor Inválido.");
			}
			
		}
			
	}

}
