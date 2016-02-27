package com.main;

import java.io.File;

public class Filesinfolder {
			public static void main(String a[]){
	        File file = new File("C:/Users/surekha/javatest");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	        }
	    }
	}
