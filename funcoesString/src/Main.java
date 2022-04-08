
public class Main {

	public static void main(String[] args) {
		String original = "abcd ABCD ytr TGHI abc     ";
		String frutas = "banana limão morango";
		
		String[] vetor = frutas.split(" ");
		String fruta1 = vetor[0];
		String fruta2 = vetor[1];
		String fruta3 = vetor[2];
		
		String st1 = original.toLowerCase();
		String st2 = original.toUpperCase();
		String st3 = original.trim();
		String st4 = original.substring(2);
		String st5 = original.substring(2, 9);
		String st6 = original.replace('a', 'x');
		String st7 = original.replace("abc", "xyz");
		int i = original.indexOf("ab");
		int j = original.lastIndexOf("ab");
		
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		System.out.println(st6);
		System.out.println(st7);
		System.out.println(i);
		System.out.println(j);
		System.out.println("A primeira fruta é: " + fruta1);
		System.out.println("A segunda fruta é: " + fruta2);
		System.out.println("A terceira fruta é: " + fruta3);

	}

}
