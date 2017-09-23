package be.pxl.computerstore.hardware;

public class GamingController extends Peripheral {

	public GamingController(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	@Override
	public String getShortDescription() {
		return getArticleNumber() + " * GamingController * " + getName() + " * " + getPrice() + "€";
	}

}
