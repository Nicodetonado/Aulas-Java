package entities;

public class GettersSetters {
	
	private String name;
	private double price;
	private int quantity;
	

		
	public GettersSetters(String name, double price, int quantity) { //construtor gerado automaticamente,
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public GettersSetters(String name, double price) { //sobrecarga para exemplo
		this.name = name;
		this.price = price;
	}

//getters e setters abaixo
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}

//tiramos o setQuantity, pois o quantidade só pode ser alterado pelo addProduct e removeProduct abaixo

	
	
	
	
	
	
	

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
