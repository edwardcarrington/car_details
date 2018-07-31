package grandcircus.lab11;

public class Car {

	protected String make;
	protected String model;
	protected int year;
	protected double price;

	public Car(String make, String model, int year, double price) {
		// super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car() {
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %d\t$%,10.2f", make, model, year, price);
	}
}
