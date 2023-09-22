// Essa aqui é um exemplo de criação de uma função que pega 3 valores e mostra o maior

package cursojava_repeticao;

import java.util.Scanner;

public class Primeira_funcao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
	}
	
	//FUNÇÕES ABAIXO
	
	//"max" é a função que pega 3 valores e devolve o maior
	public static int max (int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; //aqui informa pra função que ela deve retornar um valor. Devemos colocar o que ela deve retornar na frente do "return"		
	}
	
	//"showResult" é a função que só retorna o valor maior	
	public static void showResult(int value) { //como essa função só faz uma ação e não retorna nenhum valor. A gente usa "void"
		System.out.println("Higher = " + value);
	}
	
}
