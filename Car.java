
public class Car extends Automobile {
	private int maxPassengers;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		super(year, weight, licensePlate, make);
		// TODO Auto-generated constructor stub
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public String toString() {
		return super.toString() + " MaxPassengers: " + maxPassengers;
	}

	
	
	
}
