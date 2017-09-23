package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {

	private double clockspeed;
	private static final double MIN_CLOCKSPEED = 0.7;

	public Processor(String vendor, String name, double price, double clockspeed) {
		super(vendor, name, price);
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

	@Override
	public String toString() {
		return super.toString() + "Clock speed = " + getClockspeed() + "GHz\n";
	}
}
