package br.com.lucas.pass;

import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Functions {

	Generator gen = new Generator();
	JTextArea ta = new JTextArea();
	Scanner enter;

	boolean smal = false;
	boolean big = false;

	int length = 0;
	int choice = 0;
	
	String result;

	void selection1() {

		String[] options = new String[] { "Letters Only", "Numbers Only", "Letters + Numbers", "Letters + Symbols",
				"Default" };

		choice = JOptionPane.showOptionDialog(null, "Select a password type to be generated:",
				"Choose your Password Type", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
				options[4]);

	}

	void selection2() {

		do {
			boolean sucess = false;

			while (sucess == false) {
				try {
					enter = new Scanner(JOptionPane.showInputDialog(null, "How many characters? (in numbers)",
							"Password Length", JOptionPane.QUESTION_MESSAGE));
					length = enter.nextInt();
					sucess = true;
				} catch (NoSuchElementException e) {
					JOptionPane.showMessageDialog(null, "Not a valid number. Please, try again.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}

			smal = length <= 3;
			big = length >= 26;

			if (smal == true) {
				JOptionPane.showMessageDialog(null, "Why don't you set a longer password?", "oops",
						JOptionPane.WARNING_MESSAGE);
			} else if (big == true) {
				JOptionPane.showMessageDialog(null, "Do you really need the password to be this longer?", "oops",
						JOptionPane.WARNING_MESSAGE);
			}
		} while (big == true || smal == true);
	}

	void answer() {
		
		selection1();
		
		try {
			selection2();
		} catch (NullPointerException e) {
			close();
		}
		
		switch (choice) {
		case 0:
			result = gen.letterPassword(length);
			break;
		case 1:
			result = gen.numberPassword(length);
			break;
		case 2:
			result = gen.letterNumberPassword(length);
			break;
		case 3:
			result = gen.letterSymbolsPassword(length);
			break;
		case 4:
			result = gen.defPassword(length);
			break;
		default:
			close();
		}

		ta.setText(result);
		ta.setEditable(false);
		ta.setLineWrap(false);
		
		JOptionPane.showMessageDialog(null, ta, "Your Password", JOptionPane.PLAIN_MESSAGE);
	}

	void close() {
		System.exit(0);
	}

}
