package Day;
interface Interview
{
	public void readcv();
	
}
class A implements Interview
{
	public void readcv()
	{
		System.out.println("REad cv");
	}
	
}
class B extends A implements Interview
{
	public void readcv()
	{
	System.out.println("REad cv in child calss");
	}
}
public class Multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a1=new B();
		a1.readcv();

	}

}
