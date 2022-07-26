package br.com.lucas.pass;

public class Generator {

	private final String small = "abcdefghijklmnopkrstuvwxyz";
	private final String big = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
	private final String nums = "0123456789";
	private final String symbs = "~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
	private String result = "";

	public String defPassword(int len) {
		final String values = small + big + nums + symbs;
		char[] pass = new char[len];

		for (int i = 0; i < pass.length; i++) {
			result += values.charAt((int) Math.floor(Math.random() * (values.length() - pass.length) + pass.length));
		}
		return result;
	}

	public String numberPassword(int len) {
		final String value = nums;
		char[] pass = new char[len];

		for (int i = 0; i < pass.length; i++) {
			result += value.charAt((int) Math.floor(Math.random() * (value.length() - pass.length) + pass.length));
		}

		return result;
	}

	public String letterPassword(int len) {
		final String values = small + big;
		char[] pass = new char[len];

		for (int i = 0; i < pass.length; i++) {
			result += values.charAt((int) Math.floor(Math.random() * (values.length() - pass.length) + pass.length));
		}
		return result;
	}
	
	public String letterNumberPassword(int len) {
		final String values = small + big + nums;
		char[] pass = new char[len];

		for (int i = 0; i < pass.length; i++) {
			result += values.charAt((int) Math.floor(Math.random() * (values.length() - pass.length) + pass.length));
		}

		return result;
	}
	
	public String letterSymbolsPassword(int len) {
		final String values = small + big + symbs;
		char[] pass = new char[len];

		for (int i = 0; i < pass.length; i++) {
			result += values.charAt((int) Math.floor(Math.random() * (values.length() - pass.length) + pass.length));
		}

		return result;
	}
}
