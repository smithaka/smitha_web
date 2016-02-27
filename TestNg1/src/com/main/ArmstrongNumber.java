package com.main;

import java.util.Scanner;

public class ArmstrongNumber {
		    private static Scanner in;

			public static void main(String args[]) 
	    {
	        int num,temp,sum=0,rem=0;
	        in = new Scanner(System.in);
	        System.out.println("Enter a number ");
	        if (in.hasNextInt()) {
	            num = in.nextInt();   
	        } else {
	            num = 0;
	        }
	        temp=num;
	        while(num>0)
	        {
	            rem=num%10;
	            sum=sum+(rem*rem*rem);
	            num=num/10;
	        }
	        if(temp==sum)
	        {
	            System.out.println("\n" + temp + " is an Armstrong Number\n");
	        }
	        else
	        {
	            System.out.println("\n" + temp + " is Not an Armstrong Number\n");
	        }
	    }
	}
