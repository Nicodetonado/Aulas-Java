package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramaEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
			
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.next();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		//product.toString(product) -> essa aqui, assim como várias outras, são operações padrões de um OBJETO.
		System.out.printf("\nProduct data: " + product); //aqui o certo seria colocar entr (product.toString()), mas por ser println, só colocar a classe já serve
		
		
		
		System.out.println("\n\nEnter the number of products to be added in the stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.printf("\nUpdated data: " + product);
		
		System.out.println("\n\nEnter the number of products to be removed in the stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.printf("\nUpdated data: " + product);
				
		
		sc.close();

	}

}
