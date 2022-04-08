package entities;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto-imposto;
	}
	
	public void aumentoSalarial(double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
	}
	
	public String toString() {
		return nome+", $ "+String.format("%.2f", salarioLiquido());
	}
}
