package be.pxl.computerstore.hardware;

public class WebCam extends Peripheral {

	public WebCam(String vendor, String name, double price) {
		super(vendor, name, price);
	}

	@Override
	public String getShortDescription(){
		return getArticleNumber() + " * WebCam * " + getName() + " * " + getPrice() + "€";
}
}
