package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Digite a primeira nota do Aluno: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do Aluno: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota do Aluno: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Nota final: "+ aluno.somaNotas());
		aluno.calculoNotaFinal(aluno.somaNotas());
		
		sc.close();
	}

}
