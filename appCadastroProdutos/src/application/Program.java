package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos para cadastro? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Nome do produto" +(i+1)+": ");
			String nome = sc.next();
			System.out.print("Valor do produto" +(i+1)+": ");
			double price = sc.nextDouble();
			vect[i] = new Product(nome, price);
		}
		
		double sum = 0.0;
		
		for (int i=0;i<vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		System.out.printf("Preço médio: %.2f%n", avg);
		
		
		sc.close();
	}

}
