package com.main;


import java.util.ArrayList;

public class ArrayListelementsearch {
	public static void main(String args[]){
		ArrayList<String> arrList = new ArrayList<String>();
	System.out.println("empty array list" + arrList.size());
	arrList.add("1_Smitha");
	arrList.add(1, "2_Rekha");
	System.out.println("Location first(true/false) " + arrList.contains("1_Smitha"));
	System.out.println("Location second(true/false) " + arrList.contains("2_Rekha"));
	}
}


	
	
