package Day;
interface Student
{
	void print();
	
}
interface Teacher
{
	void show();
}
class P implements Teacher,Student
{
	public void print()
	{
		System.out.println("Student list");
	}
	public void show()
	{
		System.out.println("Teacher list");
	}
	
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      P a1=new P();
      a1.show();
      a1.print();
	}

}
