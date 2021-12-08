package Day;
class Mobile
{
	private String name;
	private float price;
	
	public String getName()
	{
		return name;
	}
	public float getprice()
	{
		return price;
	}
	public void setname(String Nname)
	{
		name=Nname;
	}
	public void setprice(float Nprice)
	{
		price=Nprice;
	}
}

public class MobileEncasulation {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.setname("Nokia");
		m1.setprice(1000);
		System.out.println("name: "+m1.getName());
		System.out.println("price: "+m1.getprice());
		
		
		
	}

}
