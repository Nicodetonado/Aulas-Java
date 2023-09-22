/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro 
 e diagonal. Usar uma classe como mostrado no projeto ao lado.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1_classe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height: ");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.area());
		System.out.printf("PERIMETER = %.2f%n", x.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		sc.close();
	}

}
