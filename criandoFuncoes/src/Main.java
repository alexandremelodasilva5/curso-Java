import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 n�meros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorNumero = maior(a,b,c);
		
		mostrarResultado(maiorNumero);
		
		sc.close();
	}
	
	public static int maior(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		
		return aux;
	}
	public static void mostrarResultado(int valor) {
		System.out.println("HIGHER: " + valor);
	}
	
}
