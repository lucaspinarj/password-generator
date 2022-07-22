package br.com.lucas.pass;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Password {

	public static void main(String[] args) {
		Creation pw = new Creation();
		
		Scanner enter = new Scanner(JOptionPane.showInputDialog("How many characters? (number values)"));
		int len = enter.nextInt();
		
		pw.generatePassword(len);
		
		String password = "Your password is: " + pw.generatePassword(len);
		
		JOptionPane.showMessageDialog(null, password);
		
		
		enter.close();

	}

}
