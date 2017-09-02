
public class CargoShip extends Ship {
	private int cargoCapacity;

	public CargoShip(String shipName, int cargoCapacity) {
		super(shipName);
		this.cargoCapacity = cargoCapacity;
	}

	public CargoShip(String shipName, int shipYear, int cargoCapacity) {
		super(shipName, shipYear);
		this.cargoCapacity = cargoCapacity;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public String toString() {
		return "Ship : " + getShipName() + " Cargo Ship Capacity: " + cargoCapacity;
	}

}
