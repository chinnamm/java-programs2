package com;

public class emp2 {

	public static void main(String[] args) {
		emp1 e1=new emp1();
		emp1 e2=new emp1();
		emp1 e3=new emp1();
		e1.insert(1, "ajeet", 45000);
		e2.insert(2, "ajay",  55000);
		e3.insert(3, "amar",  65000);
		e1.display();
		e2.display();
		e3.display();
		

	}

}
