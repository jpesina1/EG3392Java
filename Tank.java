
public class Tank extends Vehicle {
	private double armorWidth;

	public Tank(int year, double weight, double armorWidth) {
		super(year, weight);
		this.armorWidth = armorWidth;
	}

	public Tank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}

	@Override
	public String toString() {
		return super.toString() + " Tank Armor Width: " + armorWidth;
	}

	

	
	
	
	
	
}
