package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Student[] vect = new Student[10];
		
		for(int i= 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #"+(i+1)+": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email, room);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		/*for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ", " + vect[i]);
			}
		}*/
		
		for(Student obj : vect) {
			if(obj != null ) {
				System.out.println(obj);
			}/*else {
				System.out.println("Quarto vago");
			}*/
		}
		
		sc.close();

	}

}
