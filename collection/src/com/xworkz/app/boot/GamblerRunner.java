package com.xworkz.app.lambda;

public class GamblerRunner {

	public static void main(String[] args) {

		GamblerUtil.test((principal) -> {
			if (principal > 500 && principal < 1000) {
				System.out.println("less: "+principal);
				return 0;
			} else if (principal > 1000) {
				System.out.println("more: "+principal);
				return 100;
			}
			return principal;
		});
	}
}
