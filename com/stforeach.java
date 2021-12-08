package com;

public class stforeach {

	public static void main(String[] args) 
	{
		String[] names= {"c","java","c++","network"};
		System.out.println(names[4]);
		System.out.println("Printing the content\n");
		for(String name:names)
		{
			System.out.println(name);
		}

	}

}
