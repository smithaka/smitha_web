package com.main;


import java.util.Scanner;

public class Fibonaciseries {

	   private static Scanner s;

	public static void main(String[] args) {
	       s = new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
	       int n = s.nextInt();
	       for (int i = 0; i <= n; i++) {
	           System.out.print(fibonacci(i) + " ");
	       }
	   }

	   public static int fibonacci(int n) {
	       if (n == 0) {
	           return 0;
	       } else if (n == 1) {
	           return 1;
	       } else {
	           return fibonacci(n - 1) + fibonacci(n - 2);
	       }
	   }
	}

