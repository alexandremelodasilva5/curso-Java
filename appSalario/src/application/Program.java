package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Empregado: "+empregado.toString());
		System.out.println();
		
		System.out.print("Percentual para aumento de salário: ");
		double percentual = sc.nextDouble();
		empregado.aumentoSalarial(percentual);
		
		System.out.printf("Dados atualizados: "+empregado.toString());
		
		sc.close();
	}

}
