package util;

public class CurrencyConverter {
	public static double dollarPrice;
	public static double dollarBought;
	public static final double IOF = 0.06;
	
	public static double GrossDollar() {
		double grossDollar = dollarPrice * dollarBought;
		return grossDollar;
	}
	public static void Converter(double dollarPrice, double dollarBought) {
		double aux = (dollarBought*IOF)*dollarPrice + GrossDollar();
		System.out.printf("Amount to be paid in reais = %.2f%n ", aux);
	}
	
}
