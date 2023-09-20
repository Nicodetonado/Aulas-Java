package cursojava_repeticao;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
