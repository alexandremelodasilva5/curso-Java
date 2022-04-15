package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		/*Account acc = new Account(123, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1239, "Maria", 0.0, 500.0);
		
		
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		//upcasting
		@SuppressWarnings("unused")
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1238, "Bob", 1000.0, 500.0);
		Account acc3 = new SavingsAccount(1237, "Anna", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		//downcasting
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; erro de exceção
		
		if (acc3 instanceof BusinessAccount) {
			@SuppressWarnings("unused")
			BusinessAccount acc5 = (BusinessAccount)acc3;
			System.out.println("Business");
		}
		if (acc3 instanceof SavingsAccount) {
			@SuppressWarnings("unused")
			SavingsAccount acc5 = (SavingsAccount)acc3;
			System.out.println("Savings");
		}*/
		
		//Account acc = new Account(123, "Alex", 1000.0);
		Account acc1 = new SavingsAccount(1239, "Bob", 1000.0, 0.01);
		Account acc2 = new BusinessAccount(1238, "Maria", 1000.0, 500.0);
		
		List<Account> list = new ArrayList<>();
		
		list.add(acc1);
		list.add(acc2);
		
		double sum = 0.0;
		
		for(Account acc: list) {
			sum+=acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc: list) {
			acc.deposit(10.0);
			System.out.printf("Updated balance: %.2f%n", acc.getBalance());
		}
	}

}
