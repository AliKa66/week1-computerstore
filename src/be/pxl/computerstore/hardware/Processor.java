package be.pxl.computerstore.hardware;

public class Processor {

	private String vendor;
	private String name;
	private double price;
	private double clockspeed;
	private static final double MIN_CLOCKSPEED = 0.7;

	public Processor(String vendor, String name, double price, double clockspeed) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		setClockspeed(clockspeed);
	}

	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		if (clockspeed < MIN_CLOCKSPEED) {
			this.clockspeed = MIN_CLOCKSPEED;
		} else {
			this.clockspeed = clockspeed;
		}
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
