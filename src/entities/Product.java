package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
		
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
