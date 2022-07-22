package br.com.lucas.pass;

import java.util.NoSuchElementException;

import javax.swing.JOptionPane;

public class Password {

	public static void main(String[] args) {

		Functions fc = new Functions();
		
		boolean sucess = false;
		while (sucess == false) {
			try {
				fc.question();
				sucess = true;
			} catch (NoSuchElementException e) {
				JOptionPane.showMessageDialog(null, "Not a valid input.");
			}
		}

	}

}
