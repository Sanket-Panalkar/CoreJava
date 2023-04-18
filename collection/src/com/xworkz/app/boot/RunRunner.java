package com.xworkz.app.boot;

import com.xworkz.app.Util.RunnerUtil;

public class RunRunner {

	public static void main(String[] args) {
		
		RunnerUtil.test((ref)->{
			System.out.println("distance: "+ref);
			return ref;
		});
	}
}
