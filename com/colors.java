package com;

public class colors {

	 public enum Clr{Blu, Blk, Rd, Wht, Gre,}
		public static void main(String[] args) {
			Clr[] ClrNow=Clr.values();
			for(Clr Now : ClrNow)
			{
				switch(Now)
				{
				case Blu:
					System.out.println("Blue");
					break;
				case Blk:
					System.out.println("Black");
					break;
				case Rd:
					System.out.println("Red");
					break;
				case Wht:
					System.out.println("White");
					break;
				case Gre:
					System.out.println("Green");
					break;
				
				
				}
			}
			

		}


}
