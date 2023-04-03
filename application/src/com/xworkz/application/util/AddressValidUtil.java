package com.xworkz.application.util;

public class AddressValidUtil {

	public static boolean validString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 2 && value.length() < 20) {
			return true;
		}

		return false;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean validInt(int num) {

		if (num > 0 && num < 200) {

			return true;
		}

		return false;

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
