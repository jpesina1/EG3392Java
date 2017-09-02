
public class Ship {

	private String shipName;
	private int shipYear = 0;

	
	
	
	public Ship(String shipName) {
		super();
		this.shipName = shipName;
		// TODO Auto-generated constructor stub
	}
	
	

	public Ship(String shipName, int shipYear) {
		super();
		this.shipName = shipName;
		this.shipYear = shipYear;
	}



	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getShipYear() {
		return shipYear;
	}

	public void setShipYear(int shipYear) {
		this.shipYear = shipYear;
	}



	@Override
	public String toString() {
		return "Ship : " + shipName + ", Ship Year" + shipYear;
	}

	
}
