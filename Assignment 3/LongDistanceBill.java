
public class LongDistanceBill extends PhoneBill {

	public LongDistanceBill(double callRate, double monthlyRate, int time) {
		super(callRate, monthlyRate);
		System.out.println(calculateBill(time));
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateBill(int time) {
		
		return getCallRate() * time + getMonthlyRate();
	}

}
