package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0;i<n; i++) {
			System.out.println("Shape #"+(i+1)+" data:");
			System.out.print("Rectangle or circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), height, width));
			}else if(ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println("");
		System.out.println("SHAPE AREAS:");
		for(Shape s: list) {
			System.out.printf("area: %.2f%n", s.area());
		}
		
		sc.close();
	}

}
