package com.pr.packages;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("Satish");
		
		arrayList.add("alok");
	
		arrayList.add("satish");
		
		arrayList.add("ram");
		arrayList.add(null);
		//arrayList.add(101);
		
		System.out.print(arrayList);
		
		System.out.print(arrayList.size());

	}

}
