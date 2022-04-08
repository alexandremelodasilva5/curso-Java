import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/*estrutura WHILE
		while(x != 0) {
			y += x;
			x = sc.nextInt();
		}
		System.out.println("A soma é: " + y);*/
		
		//estrutura FOR
		
		/*for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			y += x;
		}
		System.out.println("A soma é: " + y);*/
		
		//estrutura DO WHILE
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em celsius: ");
			double tempCelsius = sc.nextDouble();
			double tempFaren = 9*tempCelsius/5+32;
			System.out.printf("Temperatura em Fahrenheit: %.1f%n", tempFaren);
			System.out.print("Deseja repetir (s/n)?");
			resposta = sc.next().charAt(0);
		}while(resposta != 'n');
		
		sc.close();

	}

}
