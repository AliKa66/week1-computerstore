package be.pxl.computerstore.hardware;

public class Monitor extends Peripheral {

	public Monitor(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	@Override
	public String getShortDescription() {
		return getArticleNumber() + " * Monitor * " + getName() + " * " + getPrice() + "€";
	}

}
