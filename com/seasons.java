package com;



public class seasons {

	 public enum Sea{S, W, R,}
		public static void main(String[] args) {
			Sea[] SeaNow=Sea.values();
			for(Sea Now : SeaNow)
			{
				switch(Now)
				{
				case S:
					System.out.println("Summer season");
					break;
				case W:
					System.out.println("Winter season");
					break;
				case R:
					System.out.println("Rainy season");
					break;
				
				
				
				}
			}
			

		}

}
