package com.xworkz.app.boot;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

public class PoliticalParties {

	public static void main(String[] args) {
		
		Collection<String> parties = new ArrayList<String>();
		
		parties.add("jds");
		parties.add("bjp");
		parties.add("congress");
		parties.add("aap");
		parties.add("jdu");
		System.out.println("----------by using ForEach");
		for (String ref : parties) {
			System.out.println("> "+ref);
		}
		System.out.println("----------by using for each method");
		parties.forEach(ref->System.out.println(ref));
		System.out.println("-----creating new collection of parties");
		Collection<String> changesParties = new ArrayList<String>();
		boolean newparties=changesParties.addAll(parties);
		System.out.println(newparties);
		System.out.println("----all parties in uppercaes");
		changesParties.forEach(ref->System.out.println(changesParties+""+ref.toUpperCase()));
		
		//percentage.esreem().filter(e->e<60).forEach(e->sys(e));
	}
//percentahe.streem,filter,foeach
}