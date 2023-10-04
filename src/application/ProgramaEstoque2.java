package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class ProgramaEstoque2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Product2 product = new Product2(); .. Como a gente fez um Construtor na classe Profuct2, não precisa instanciar ele aqui. E sim no fim.
		
		// abaixo temos prints só pra mostrar que o prodct está sendo uma variável com valores vazios
// 		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.quantity);
			
		
		System.out.print("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.next(); //variável temporária pq fizemos ela no Construtor
		System.out.println("Price: ");
		double price = sc.nextDouble(); //variável temporária pq fizemos ela no Construtor
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt(); //variável temporária pq fizemos ela no Construtor
		Product2 product = new Product2(name, price, quantity); // o construtor serve para proteger com que a classe não fique sem valores
		
		//product.toString(product) -> essa aqui, assim como várias outras, são operações padrões de um OBJETO.
		System.out.printf("\nProduct data: " + product); //aqui o certo seria colocar entr (product.toString()), mas por ser println, só colocar a classe já serve
		
		
		
		System.out.println("\n\nEnter the number of products to be added in the stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.printf("\nUpdated data: " + product);
		
		System.out.println("\n\nEnter the number of products to be removed in the stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.printf("\nUpdated data: " + product);
				
		
		sc.close();

	}

}
