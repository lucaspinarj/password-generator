package br.com.lucas.pass;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Functions {

	void question() {
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
}
