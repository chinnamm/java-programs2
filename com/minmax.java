package com;

public class minmax {

	public static void main(String[] args) {
		int a=2;
		int b=10;
		int min=(a>b)?a:b;
		System.out.println("Minimum value = "+min);
		
		int min1=(a>b)?b:a;
		System.out.println("Minimum value = "+min1);
		
		int max=(a<b)?b:a;
		System.out.println("Maximum value = "+max);
		
		int max1=(a>b)?a:b;
		System.out.println("Maximum value = "+max1);
		
		

	}

}
