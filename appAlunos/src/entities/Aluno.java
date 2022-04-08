package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotas() {
		return nota1+nota2+nota3;
	}
	
	public void calculoNotaFinal (double notaFinal) {
		double aux = 60;
		if(notaFinal > aux) {
			System.out.println("Passou");
		}else {
			System.out.println("Reprovado");
			System.out.println("Faltou "+(aux-notaFinal)+ " pontos.");
		}
	}
}
