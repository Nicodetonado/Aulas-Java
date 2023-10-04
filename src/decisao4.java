import java.util.Scanner;

public class decisao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, ht;
		
		System.out.println("Digite a hora inicial: ");
		hi = sc.nextInt();
		System.out.println("Digite a hora final: ");
		hf = sc.nextInt();
		
		if (hi < hf) {
			ht = hf - hi;
		} else {
			ht = 24 - hi + hf;
		}
		
		System.out.println("O JOGO DUROU " + ht + " HORA(S)");
		sc.close();

	}

}
