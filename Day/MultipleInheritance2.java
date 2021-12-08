package Day;

interface Ad
{
	void display();
}
abstract class Bb
{
	abstract void display();

void hello()
{
 System.out.println("Hello Abstract in java");	
}
}
class C extends Bb implements Ad
{
	public void display()
	{
		System.out.println("Abstract class in child");
		
	}
}

public class MultipleInheritance2 {

	public static void main(String[] args) 
	{
		C c=new C();
		c.display();
	}

}
