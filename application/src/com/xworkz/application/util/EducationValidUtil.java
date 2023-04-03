package com.xworkz.application.util;

import java.time.LocalDate;

public class EducationValidUtil {

	public static boolean validString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 2 && value.length() < 20) {

			return true;
		}
		return false;
	}

	public static boolean validInt(int value) {
		if (value < 100 && value > 0) {

			return true;
		}
		return false;

	}

	public static boolean validDate(LocalDate date) {
		LocalDate after = LocalDate.of(2022, 2, 6);
		LocalDate before = LocalDate.of(2028, 2, 4);
		if (date != null && date.isBefore(before) && date.isAfter(after)) {

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
