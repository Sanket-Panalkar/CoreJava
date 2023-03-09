package com.xworkz.runner;

import com.xworkz.implimentor.Developer;
import com.xworkz.interfaceclass.CodingRule;

public class CodingRuleRunner {
	
	public static void main(String[] args) {
		Object obj = new Developer();
		Developer developer = new Developer();
		CodingRule codingRule = new Developer();
		
		Developer cast = (Developer) obj;
		
		developer.checkCommenting();
		developer.checkDuplicateCode();
		developer.checkIndentation();
		developer.checkkeyWords();
		developer.checkNaming();
		developer.checkSpacing();
		developer.checkSyntax();
		developer.chekErrorHandling();
		developer.getClass();
		developer.hashCode();
		developer.toString();
		
		System.out.println("------------------");
		codingRule.checkCommenting();
		codingRule.checkDuplicateCode();
		codingRule.checkIndentation();
		codingRule.checkkeyWords();
		codingRule.checkNaming();
		codingRule.checkSpacing();
		codingRule.checkSyntax();
		codingRule.chekErrorHandling();
	    
	}
}
