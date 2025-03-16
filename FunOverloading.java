class Base
{
	void display()
	{
		System.out.println("You are in base class");
	}
}
class Derived extends Base
{
	void display(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	    System.out.println("Subtraction = "+(a-b));
		System.out.println("Multiplication = "+(a*b));
		System.out.println("Division = "+(a/b));
	}
}
class FunOverloading
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.display();
		d.display(10,20);
	}		
}
