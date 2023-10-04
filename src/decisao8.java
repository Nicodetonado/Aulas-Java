/*EXERCÍCIO 08: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com */


//Import para mudar decimais de vírgula para ponto, que nem nos EUA.
import java.util.Locale;
import java.util.Scanner;

public class decisao8 {

	public static void main(String[] args) {
		//abaixo é o preparo de variáveis e das classes
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal, imposto = 0;

		//input do usuário		
		System.out.println("Digite seu salário: ");
		sal = sc.nextDouble();

		//estrutura de decisão pra calcular imposto
		//o primeiro é ISENTO, pois é abaixo de 2k
		if (sal <= 2000) {
			imposto = 0.0;
		} //aplica 8% no valor acima de 2k
		else if (sal <= 3000) {
			imposto = (sal - 2000) * 0.08;
		} // aplica 18% no valor acima de 3k e + 80 reais (que é o valor máximo de 8% entre 2k e 3k)
		else if (sal <= 4500.0) {
			imposto = (sal - 3000) * 0.18 + 80;
		}
		else { // mesma lógica do de cima. Só que com +28% acima de valores de 4500
			imposto = (sal - 4500) * 0.28 + 270 + 80;
		}
		
		//dois prints. Um pra isento e um pra mostrar o imposto
		if (imposto == 0) {
			System.out.println ("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
