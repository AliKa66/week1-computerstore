package be.pxl.computerstore.hardware;

abstract class Peripheral extends ComputerComponent {

	public Peripheral(String vendor, String name, double price) {
		super(vendor, name, price);
	}

}