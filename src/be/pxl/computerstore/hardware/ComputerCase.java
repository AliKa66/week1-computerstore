package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {

	private Dimension dimension;
	private double weight;
	private String articleNumber;

	public ComputerCase(String vendor, String name, double price) {
		super(vendor, name, price);
		generateArticleNumber();
	}


	private void generateArticleNumber() {
		//string serial1, serial2;
	}

	public Dimension getDimension() {
		return dimension;
	}


	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
		
	public String getArticleNumber() {
		return articleNumber;
	}
}
