
public class Vehicle {
	private int year;
	private double weight;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int year, double weight) {
		super();
		this.weight = weight;
		this.year = year;
		// TODO Auto-generated constructor stub
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Vehicle Year: " + year + ", weight: " + weight;
	}
	
	
	
	
	
	
	
	
}
