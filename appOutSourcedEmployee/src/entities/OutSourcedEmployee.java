package entities;

public class OutSourcedEmployee extends Employee {
	
	public Double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final Double payment() {
		double regularPayment = valuePerHour *= hours;
		return  regularPayment += additionalCharge + (additionalCharge*0.1);
	}
	
	@Override
	public String toString() {
		return name +
				" - $ "+
				String.format("%.2f", payment());		
	}
	
}
