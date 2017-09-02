
public class CruiseShip extends Ship {
	private int maxPassengers;

	public CruiseShip(String shipName, int maxPassengers) {
		super(shipName);
		this.maxPassengers = maxPassengers;
	}

	public CruiseShip(String shipName, int shipYear, int maxPassengers) {
		super(shipName, shipYear);
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
		return "Ship : " + getShipName() + " Cruise Ship Max Passengers: " + maxPassengers;
	}

}
