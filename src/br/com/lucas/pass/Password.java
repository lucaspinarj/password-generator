package br.com.lucas.pass;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Password {

	public static void main(String[] args) {
		Creation pw = new Creation();
		
		Scanner enter = new Scanner(JOptionPane.showInputDialog("Qual o tamanho da sua senha? (qtd em números)"));
		int numero;
		
		JOptionPane.showInputDialog(new Creation());
		
		
		enter.close();

	}

}
