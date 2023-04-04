package com.xworkz.application.util;

public class DesertValidUtil {
	public static boolean validInt(int value) {
		if (value > 0 && value < 1000000) {
			return true;
		}
		return false;
	}

	public static boolean validString(String val) {
		if (val != null && !val.isEmpty() && val.length() > 3 && val.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (!temp) {
				return false;
			}

		}
		return true;
	}
}