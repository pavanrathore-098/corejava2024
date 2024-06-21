package com.pr.packages;
import java. util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
List arrayList=new ArrayList();
arrayList.add("amit");
arrayList.add("sumit");
arrayList.add("shivam");
arrayList.add("gourav");
arrayList.add("shyam");
arrayList.add("null");
arrayList.add("11");
System.out.println(arrayList);
System.out.println(arrayList.size());
Iterator list=arrayList.iterator();

while(list.hasNext())
{
    System.out.println(list.next());
}
}

	}


