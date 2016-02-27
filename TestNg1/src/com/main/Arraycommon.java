package com.main;

public class Arraycommon 
{
	   public static void main(String a[]){
	        int[] arr1 = {1,2,3,4,5};
	        int[] arr2 = {7,2,3,9,40,32,4};
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                    System.out.println(arr1[i]);
	                }
	            }
	        }
	   }
}
