package com.main;

import java.util.ArrayList;
import java.util.List;

public class ElementinList {
public static void main(String[] args) {
	List<String> listStrings = new ArrayList<String>();
	listStrings.add("rekha");
	listStrings.add("smitha");
	 if (listStrings.contains("rekha")) {
		   System.out.println("Found the element");
	 } else {
	     System.out.println("There is no such element");
	 }
}
}


