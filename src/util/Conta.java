package util;

public class Conta {
	private int numConta;
	public String nome;
	private double valor;
	

	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;	
	}
	
	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}


	public int getNumConta() { // manda o número da conta
		return numConta;
	}

	public String getNome() { // manda o nome da conta
		return nome;
	}
	public void setNome(String nome) { // muda o nome da conta
		this.nome = nome;
	}

	public double getValor() { //manda o valor na conta
		return valor;
	}
	
	
	
	//métodos
	public void numeroC (int numConta) {
		this.numConta = numConta;
	}
	
	public void saque(double valor) {
		this.valor = this.valor - valor - 5.00;
	}
	
	public void deposito(double valor) {
		this.valor += valor;
	}
	
	public String toString() {
		return 
			"Account " + numConta
			+ ", Holder: " + nome 
			+ ", Balance: $ " 
			+ String.format("%.2f", getValor())
			+ "\n";
	}

	

}
