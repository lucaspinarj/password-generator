package br.com.lucas.pass;

import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Password {

	static void question() {
		Creation pw = new Creation();
		Scanner enter;
		int len = 0;

		try {
			do {
				enter = new Scanner(JOptionPane.showInputDialog(null, "How many characters? (number values)",
						"Password Generator", JOptionPane.QUESTION_MESSAGE));
				len = enter.nextInt();

				if (len <= 4) {
					JOptionPane.showMessageDialog(null, "Don't you want to try a longer password?", "oops!",
							JOptionPane.PLAIN_MESSAGE);
				}

				enter.close();
			} while (len <= 4);
		} catch (NullPointerException e) {
			JOptionPane.getRootFrame().dispose();
		}

		String password = "Your password is: " + pw.generatePassword(len);
		JOptionPane.showMessageDialog(null, password);

		System.out.println(password);

	}

	public static void main(String[] args) {

		boolean sucess = false;
		while (sucess == false) {
			try {
				question();
				sucess = true;
			} catch (NoSuchElementException e) {
				JOptionPane.showMessageDialog(null, "Not a valid input.");
			}
		}

	}

}
