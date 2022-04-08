package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Preço:");
		double price = sc.nextDouble();
		
		Product product = new Product(nome, price);
		
		System.out.println("Dados do produto: "+product.toString());
		System.out.println();
		
		System.out.print("Adicionar Produto:");
		int qtd = sc.nextInt();
		product.adicionaProduto(qtd);
		
		System.out.println("Dados do produto atualizados: "+product.toString());
		System.out.println();
		
		System.out.print("Remover Produto:");
		qtd = sc.nextInt();
		product.removeProduto(qtd);
		
		System.out.println("Dados do produto atualizados: "+product.toString());
		System.out.println();
		
		
		
		sc.close();
	}

}
