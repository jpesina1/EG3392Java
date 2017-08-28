
public class Truck extends Automobile {
	private double towCapacity;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super(year, weight, licensePlate, make);
		this.towCapacity = towCapacity;
		// TODO Auto-generated constructor stub
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + " Tow Capacity:" + towCapacity;
	}

}
