package Day;

import Day.Array.Student;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Student[] name=new Student[10];
		for(int i=0; i<name.length; i++)
		{
			name[i]=new Student();
		}
		name[0].setId("1");
		name[0].setName("Abc");
		name[0].setAge(25);

		name[1].setId("2");
		name[1].setName("Rajan");
		name[1].setAge(25);


		name[2].setId("3");
		name[2].setName("Priya");
		name[2].setAge(25);

		for(Student s:name)
		{
		System.out.println(s.toString());
		}

	}

}
