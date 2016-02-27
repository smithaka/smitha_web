package com.main;

public class Starspattern {
	 public static void main(String[] args) {
		    int row, numStars;
		 
		    for (row = 1; row <= 6; row++) {
		      for(numStars = 1; numStars <= row; numStars++) {
		        System.out.print("*");
		      }
		      System.out.println(); // Go to next line
		    }
		  }
		}

