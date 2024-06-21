package com.pr.packages;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
	       HashSet<String> hashSet = new HashSet<String>();
	       hashSet.add("Pooja");
	       hashSet.add("bharat");
	       hashSet.add("radha");
	       hashSet.add("amit");
	       hashSet.add("summit");
	       hashSet.add("akansha");
	       hashSet.add("uma");
	       hashSet.add("komal");
	       hashSet.add("null");
	       hashSet.add("null");
	       Iterator<String> itr = hashSet.iterator();
           
           while(itr.hasNext()) {
               System.out.println(itr.next());
           }
           
       }


	
	}

