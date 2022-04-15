package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double anualIncomeTax = super.getAnualIncome();
		
		if(anualIncomeTax < 20000.0) {
			anualIncomeTax = (anualIncomeTax*0.15)-(healthExpenditures*0.5);
		}else if(anualIncomeTax >= 20000.0) {
			anualIncomeTax = (anualIncomeTax*0.25)-(healthExpenditures*0.5);
		}
		
		return anualIncomeTax;
	}
	
	public String toString() {
		return super.getName()+
				": $ "+
				String.format("%.2f", tax());
	}

}
