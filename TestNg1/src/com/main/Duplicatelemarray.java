package com.main;

import java.util.HashSet;

public class Duplicatelemarray {
	 String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
	 HashSet<String> set = new HashSet<String>();
	 {
     for (String arrayElement : strArray)
     {
         if(!set.add(arrayElement))
         {
             System.out.println("Duplicate Element is : "+arrayElement);
         }
     }
 }
}
