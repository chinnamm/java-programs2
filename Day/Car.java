package Day;

public class Car {
	void CarSpeed()
	{
		System.out.println("Car Speed is 100");
	}

}
class Tata extends Car{
	void CarSpeed()
	{
		System.out.println("Car Speed is 150");
	}
}
class Nano extends Car{
	void CarSpeed()
	{
		System.out.println("Car Speed is 50");
	}
}
class Bmw extends Car{
	void CarSpeed()
	{
		System.out.println("Car Speed is 250");
	}
}