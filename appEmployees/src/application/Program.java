package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Employees;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		Employees emp = new Employees();
		
		
		System.out.println("How many employees will be registred? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(" ");
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employees(id, name, salary));
		}
		
		System.out.println(" ");
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		
		
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
		}else {
			System.out.println("This ID does not exist.");
		}
		
		System.out.println(" ");
		System.out.println("List of Employees: ");
		
		for(Employees obj: list) {
			
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
