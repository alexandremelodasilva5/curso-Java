package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollarPrice = CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double dollarBought = CurrencyConverter.dollarBought = sc.nextDouble();
		CurrencyConverter.Converter(dollarPrice, dollarBought);
		
		sc.close();
	}

}
