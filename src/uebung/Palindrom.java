package uebung;

import javax.swing.JOptionPane;

public class Palindrom {

	public static void main(String[] args) {

		boolean pruefung = true;
		String message = JOptionPane.showInputDialog(null, "Gib bitte ein Wort ein.");

		String message1 = message.toLowerCase();

		for (int i = 0; i < message1.length(); i++) {
			if (message1.charAt(i) != message1.charAt((message1.length() - 1 - i))) {
				pruefung = false;
				break;
			}
		}

		if (pruefung == true) {
			JOptionPane.showMessageDialog(null, "Bei " + message + " handelt es sich um ein Palindrom!");
		} else {
			JOptionPane.showMessageDialog(null, "Bei " + message + " handelt es sich um kein Palindrom!");

		}

	}
}
