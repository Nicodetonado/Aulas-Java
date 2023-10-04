package entities;

public class Product2 {
	
	public String name;
	public double price;
	public int quantity;
	
	//Abaixo temos um exemplo de construtor.
	public Product2 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//Abaixo temos um exemplo de sobrecarga (criar um novo método com o mesmo nome)
	public Product2 (String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; // esse "this.quantity" é opcional, pq o java começa com 0. A própria palavra "this" é opcional pq não temos ambiguidade com 2 "quantity"
	}
		
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //this."atriburo" se referencia ao atributo declarado dentro dessa classe. Assim não rola ambiguidade.
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	
	public String toString() {//aqui a gente está sobreponto o toString padrão. Estamos criando o nosso toString
		return name
			+ ", $ "
			+ String.format("%.2f", price) //aqui estamos usando uma máscara de formatação pra mudar o número de casas que aparece no toString
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
