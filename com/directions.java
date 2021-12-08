package com;

import com.colors.Clr;

public class directions {

	 public enum Dir{E, W, S, N,}
		public static void main(String[] args) {
			Dir[] DirNow=Dir.values();
			for(Dir Now : DirNow)
			{
				switch(Now)
				{
				case E:
					System.out.println("East");
					break;
				case W:
					System.out.println("West");
					break;
				case S:
					System.out.println("South");
					break;
				case N:
					System.out.println("North");
					break;
				
				
				}
			}
			

		}

}
