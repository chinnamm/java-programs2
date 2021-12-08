package Day;
class BaseClass
{
	int rollno=100;
	void baseMethod()
	{
		System.out.println("Base class method");
	}
}
class M extends BaseClass
{
	void  baseMethod()
	{
		System.out.println("Child Method");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass b1=new M();
		b1.rollno=200;
		b1.baseMethod();
		
	}

}
