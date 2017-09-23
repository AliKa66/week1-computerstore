package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

	private Processor processor;
	private ComputerCase computerCase;
	private Peripheral[] peripherals;
	private int amountAddedPeripherals;
	public static final int MAX_PERIPHERAL = 3;

	public ComputerSystem() {
		peripherals = new Peripheral[MAX_PERIPHERAL];

	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public int getNumberOfPeripherals() {
		return amountAddedPeripherals;
	}

	public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
		if (getNumberOfPeripherals() >= MAX_PERIPHERAL) {
			throw new TooManyPeripheralsException("Added too many peripherals.");
		}
		int emptyIndex = 0;
		while (this.peripherals[emptyIndex] != null) {
			emptyIndex++;
		}
		this.peripherals[emptyIndex] = peripheral;
		amountAddedPeripherals++;
	}

	public void removePeripheral(String articleNumber) {
		boolean peripheralFound = false;
		for (int index = 0; index < amountAddedPeripherals && peripheralFound == false; index++) {
			if (peripherals[index].getArticleNumber().equals(articleNumber)) {
				peripherals[index] = null;
				peripheralFound = true;
				amountAddedPeripherals--;
			}
		}
	}

	public Peripheral[] getPeripherals() {
		return peripherals;
	}

	@Override
	public double totalPriceExcl() {
		double priceProcessor = processor.getPrice();
		double priceCase = computerCase.getPrice();
		double pricePeripherals = 0;

		if (amountAddedPeripherals >= 0) {
			for (Peripheral peripheral : peripherals) {
				if (peripheral != null) {
					pricePeripherals += peripheral.getPrice();
				}
			}
		}

		return priceProcessor + priceCase + pricePeripherals;
	}

	@Override
	public String toString() {
		StringBuilder peripherals = new StringBuilder();
		int numberPerihperal = 1;
		for (Peripheral peripheral : this.peripherals) {
			if (peripheral != null) {
				peripherals.append(String.format("Randapparaat %d:\n", numberPerihperal));
				peripherals.append(peripheral.toString());
				numberPerihperal++;
			}
		}
		return "Computercase:\n" + computerCase.toString() + "Processor:\n" + processor.toString()
				+ peripherals.toString()
				+ String.format("TOTAAL EXCL.: %.2f\n" + "TOTAAL INCL.: %.2f\n", totalPriceExcl(), totalPriceIncl());
	}

}
