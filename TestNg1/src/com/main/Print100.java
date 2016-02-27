package com.main;

public class Print100 {

	public static void main(String[] args) {
		print(100);
	}
	private static void print(int n) {
		if(n > 1) {
			print(n-1);
		}
		System.out.println(n);
		}
	   	}

	