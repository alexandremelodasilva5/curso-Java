package entities;

public class Employees {
	private int id;
	private String name;
	private double salary;
	
	
	public Employees() {
		
	}

	public Employees(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		
		return id+
				", "+
				name+
				", "+
				String.format("%.2f", salary);
	}
	
	public void IncreaseSalary(double percentage) {
		salary += salary * percentage/100;
	}
}
