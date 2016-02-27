package com.main;

import java.util.Scanner;

public class PingPong {
	
    private static Scanner in;
	public static void main(String args[]) {
	int num;
    in = new Scanner(System.in);
    System.out.println("Enter a number ");
    if (in.hasNextInt()) {
        num = in.nextInt();   
    } else {
        num = 0;
    }
    {
	for( int number = 1 ; number < num  ; number++ )
    {
        boolean shouldPrintNumber = true;

        System.out.println("\n");
        if( (number%3) == 0 )
        {
            System.out.print("ping");
            shouldPrintNumber = false;
        }
        if( (number%5) == 0 )
        {
            System.out.print("pong");
            shouldPrintNumber = false;
        }

        if( shouldPrintNumber )
        {
            System.out.print( number );
        }

    }
	}
	}
}	
