package be.pxl.computerstore.hardware;

import java.util.Scanner;

public class Keyboard extends Peripheral {

	private String keyboardLayout;
	private final String[] ALLOWED_KEYBOARD_LAYOUT = { "QWERTY", "AZERTY" };

	public Keyboard(String vendor, String name, double price, String keyboardLayout) {
		super(vendor, name, price);
		setKeyboardLayout(keyboardLayout);
	}

	private void setKeyboardLayout(String keyboardLayout) {
		if (keyboardLayout.toUpperCase().equals(ALLOWED_KEYBOARD_LAYOUT[0])) {
			this.keyboardLayout = ALLOWED_KEYBOARD_LAYOUT[0];
		} else if (keyboardLayout.toUpperCase().equals(ALLOWED_KEYBOARD_LAYOUT[1])) {
			this.keyboardLayout = ALLOWED_KEYBOARD_LAYOUT[1];
		} else {
			Scanner keyboard = new Scanner(System.in);
			String input = "";
			while(input.toUpperCase().equals(ALLOWED_KEYBOARD_LAYOUT[0]) ||
					input.toUpperCase().equals(ALLOWED_KEYBOARD_LAYOUT[1])){
				System.out.println("Kies het juiste layout voor uw toetsenbord(QWERTY of AZERTY):");
				input = keyboard.nextLine();
			}
			setKeyboardLayout(input);
			keyboard.close();
		}
	}
	
	@Override
	public String getShortDescription(){
		return getArticleNumber() + " * Keyboard * " + getName() + " * " + getPrice() + "€";
}

}
