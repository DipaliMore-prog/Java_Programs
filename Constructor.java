class A
{
	
	A()
	{
		System.out.println("Class A Constructor");
	}
}
class B 
{
	
	B()
	{
		System.out.println("Class B Constructor");
	}
}
class Constructor
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
	}
}
