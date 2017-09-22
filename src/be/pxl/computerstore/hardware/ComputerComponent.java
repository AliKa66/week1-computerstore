package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {

	private String vendor;
	private String name;
	private double price;
	private String articleNumber;
	private static Random rand;
	private static int amountComponents;

	static{
		rand = new Random();
	}
	
	public ComputerComponent(String vendor, String name, double price) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		amountComponents++;
		generateArticleNumber();
	}

	private void generateArticleNumber() {
		String serial1 = vendor;
		
		if(serial1.length() < 3){
			while(serial1.length() < 3){
				serial1 = serial1.concat("X").toUpperCase();
			}
		}else{
			serial1 = serial1.substring(0, 3).toUpperCase();
		}
		
		String serial2 = String.format("%05d", amountComponents);
		String serial3 = (rand.nextInt(8) + 1) + "" 
		+ (rand.nextInt(8) + 1) + "" + (rand.nextInt(8) + 1);
		
		articleNumber = serial1 + "-" + serial2 + "-" + serial3;
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

	public String getArticleNumber() {
		return articleNumber;
	}
	
	

}