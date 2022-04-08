package entities;

public class Product {
	public String nome;
	public double price;
	public int qtd;
	
	public Product() {
	}
	
	public Product(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}
	
	public Product(String nome, double price, int qtd) {
		this.nome = nome;
		this.price = price;
		this.qtd = qtd;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public double valorTotalEstocado() {
		return price*qtd;
	}
	
	public void adicionaProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProduto(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome +
				", $" + 
				String.format("%.2f", price)+
				", "+
				qtd+
				" units, Total: $"+
				String.format("%.2f",valorTotalEstocado());
	}

}
