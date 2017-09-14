
public abstract class PhoneBill {
	protected double monthlyRate;
	protected double callRate;
	

	public PhoneBill(double callRate,double monthlyRate) {
		super();
		this.callRate = callRate;
		this.monthlyRate = monthlyRate;
	}
	
	public double getCallRate() {
		return callRate;
	}

	public double getMonthlyRate() {
		return monthlyRate;
	}
	public abstract double calculateBill(int time);
}
