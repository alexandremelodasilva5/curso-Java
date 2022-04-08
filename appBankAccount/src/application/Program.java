package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankaccount = new BankAccount();
		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		System.out.print("Is there an initial deposit(y/n)? ");
		char choose = sc.next().charAt(0);
		
		if (choose == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			bankaccount = new BankAccount(accountNumber, name, initialValue);	
		}else if (choose == 'n') {
			bankaccount = new BankAccount(accountNumber, name);
			
		}
		
		System.out.println("Account data: ");
		System.out.println(bankaccount.toString());
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		bankaccount.depositValue(value);
		System.out.println("Account data updated: ");
		System.out.println(bankaccount.toString());
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		bankaccount.withdrawValue(value);
		System.out.println("Account data updated: ");
		System.out.println(bankaccount.toString());
		
		sc.close();

	}
			
	
}
