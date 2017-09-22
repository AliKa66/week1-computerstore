package be.pxl.computerstore.hardware;

public class ComputerComponent {

	private String vendor;
	private String name;
	private double price;

	public ComputerComponent(String vendor, String name, double price) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
	}

	public String getVendor() {
		return vendor;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}