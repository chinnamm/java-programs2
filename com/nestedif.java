package com;

public class nestedif {

	public static void main(String[] args) {
		String adress="delhi India";
		if(adress.endsWith("india"))
		{
			if(adress.contains("Meerut"))
			{
				System.out.println("Your city is meerut");
			}
			else if(adress.contains("Noida"))
			{
				System.out.println("Your city is Noida");
			}
			else
			{
				System.out.println(adress.split("e")[0] +" "+adress.split("I")[1]);
				
			}
		}
		else
		{
			System.out.println("Your not living in india");
		}

	}

}
