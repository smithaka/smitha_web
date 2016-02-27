package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Filewordcount 
	{
    public static void main (String args[]) throws Exception {

    	File file = new File("C:/Users/surekha/test.txt");
    	Scanner sc = new Scanner(new FileInputStream(file));
    	int count=0;
    	while(sc.hasNext()){
    	    sc.next();
    	    count++;
    	}
    	System.out.println("Number of words: " + count);
    }
}