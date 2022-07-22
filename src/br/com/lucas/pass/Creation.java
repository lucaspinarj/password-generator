package br.com.lucas.pass;

public class Creation {

	private final String small = "abcdefghijklmnopkrstuvwxyz";
	private final String big = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
	private final String nums = "0123456789";
	private final String symbs = "!@#$%^&*_=+-/.?<>)";

	public void generatePassword(int len) {

		final String values = small + big + nums + symbs;
		char[] pass = new char[len];

		String result = "";
		for (int i = 0; i < pass.length; i++) {
			result += values.charAt((int) Math.floor(Math.random() * (values.length() - pass.length) + pass.length));
		}
		System.out.println(result);
	}
}
