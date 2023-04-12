package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class bookPriceCollection {

	public static void main(String[] args) {
		
		Collection<Integer> LongSizeBookPrice = new ArrayList<Integer>();
		LongSizeBookPrice.add(20);
		LongSizeBookPrice.add(22);
		LongSizeBookPrice.add(15);
		LongSizeBookPrice.add(26);
		
		Collection<Integer> KingSizeBookPrice = new ArrayList<Integer>();
		KingSizeBookPrice.add(10);
		KingSizeBookPrice.add(11);
		KingSizeBookPrice.add(12);
		KingSizeBookPrice.add(13);
		
		Collection<Integer> CutSizeBookPrice = new ArrayList<Integer>();
		CutSizeBookPrice.add(5);
		CutSizeBookPrice.add(6);
		CutSizeBookPrice.add(7);
		CutSizeBookPrice.add(8);
		
		Collection<Integer> allBookPrice = new ArrayList<Integer>();
		allBookPrice.addAll(LongSizeBookPrice);
		allBookPrice.addAll(KingSizeBookPrice);
		allBookPrice.addAll(KingSizeBookPrice);
		
		System.out.println("All BookPrice :" +allBookPrice.size());
		//for-each Loop
		for (Integer price : allBookPrice) {
			System.out.println("price :"+ price);
		}
		
		boolean containsAll=allBookPrice.containsAll(LongSizeBookPrice);
		System.out.println(containsAll);
		
		boolean removed=allBookPrice.removeAll(CutSizeBookPrice);
		System.out.println("removed :"+removed + " size:"+ allBookPrice.size());
		
		
		boolean retain =KingSizeBookPrice.retainAll(KingSizeBookPrice);
		System.out.println("retain :"+ retain + " size "+ allBookPrice.size());
		
		Object[] array =allBookPrice.toArray();
		System.out.println(Arrays.toString(array));
		
		
	}
}
