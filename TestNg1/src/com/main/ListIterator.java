package com.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {
public static void main(String[] args){
	ArrayList a1 = new ArrayList();
	a1.add("rekha");
	a1.add("smitha");
	System.out.println("Contents of list ");
	Iterator itr = a1.iterator();
	while(itr.hasNext()) {
		Object element = itr.next();
		System.out.println(element +" ");
	}
	System.out.println();
	}
}




