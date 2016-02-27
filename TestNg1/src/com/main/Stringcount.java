package com.main;

public class Stringcount {
	public static class CountSubstring {
			public static void main(String[] args){
			System.out.println(countSubstring("hello", "hello helloworld"));
			System.out.println(countSubstring("aaa", "aaa bababab"));
		}
			
			public static  int countSubstring(String subStr, String str){
				int count = 0;
				for (int loc = str.indexOf(subStr); loc != -1;
				     loc = str.indexOf(subStr, loc + subStr.length()))
					count++;
				return count;
			}
	}
}
