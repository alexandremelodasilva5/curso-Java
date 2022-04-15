package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}



	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double anualIncomeTax = super.getAnualIncome();
		
		if(numberOfEmployees > 10) {
			anualIncomeTax = (anualIncomeTax*0.14);
		}else{
			anualIncomeTax = (anualIncomeTax*0.16);
		}
		
		return anualIncomeTax;
	}
	
	public String toString() {
		return super.getName()+
				": $ "+
				String.format("%.2f", tax());
	}

}
