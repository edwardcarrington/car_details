package grandcircus.lab11;

public class UsedCar extends Car {

	protected double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public UsedCar() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + String.format("  %.1f miles", mileage);
	}
}
