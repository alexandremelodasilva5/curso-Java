import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/* código de calculo de média
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite as notas:");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		nota4 = sc.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media > 0 && media < 5) {
			System.out.printf("Sua média foi %.1f e você foi reprovado", media);
		}else if(media > 5 && media < 7) {
			System.out.printf("Sua média foi %.1f e você foi mediano", media);
		}else if(media > 7) {
			System.out.printf("Sua média foi %.1f e você foi muito bem", media);
		}*/
		
		// código calculo de minutagem
		
		
		
		/*int minutosUtilizados, valor, minutosFixos, valorExcedido;
		
		minutosUtilizados = sc.nextInt();
		valor = 50;
		minutosFixos = 100;
		
		if(minutosUtilizados <= minutosFixos) {
			System.out.printf("Valor a pagar: R$ %d", valor);
		}else {
			valorExcedido = ((minutosUtilizados - minutosFixos)*2) + valor ;
			System.out.printf("Valor a pagar: R$ %d", valorExcedido);
		}*/
		
		/*código switch
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("O dia é: " + dia);*/
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20)? preco * 0.05: preco * 0.1;
		System.out.println(desconto);
		
		sc.close();
	}

}
