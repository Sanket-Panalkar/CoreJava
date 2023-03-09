package com.xworkz.things;

import com.xworkz.interfaceclass.DubaiVisaRule;
import com.xworkz.interfaceclass.PassportRule;

public class Implimenter extends AbstractInfo implements PassportRule,DubaiVisaRule,Developer{

	@Override
	public String citizen() {
		
		return null;
	}

	@Override
	public boolean criminalRecord() {
	
		return false;
	}

	@Override
	public boolean jail() {
		
		return false;
	}

	@Override
	public long minAmount() {
		
		return 0;
	}

	@Override
	public String stayingHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int maxGoldLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean followStanderds() {
		return false;
		
		
	}

	@Override
	public boolean underStandingConcepts() {
		return false;
		
		
	}

}
