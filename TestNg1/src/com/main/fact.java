package com.main;

public class fact {

	
public static void main (String[] arg)
{

	int n = 4;
	int result = fact(n);
	System.out.println("fact of 4 is" +result);
}
			public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
			else {
				return n * fact(n-1);
		}
	}
}
