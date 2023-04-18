package com.xworkz.app.boot;

import com.xworkz.app.Util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {
		
		ShooterUtil.test( (gun)->{
			System.out.println(" gun type "+gun);
			return false;
		} );
	}
}