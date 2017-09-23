package be.pxl.computerstore.hardware;

public class Mouse extends Peripheral {

	public Mouse(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	@Override
	public String getShortDescription() {
		return getArticleNumber() + " * Mouse * " + getName() + " * " + getPrice() + "€";
	}

}
