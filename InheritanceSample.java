class A 
{
	
	void Display()
	{
		System.out.println("Class A method");
	}
	void Calculate(int a,int b)
	{
		int x,y;
		x = a;
		y = b;
		System.out.println("Modulous of x and y: "+(x%y));
	}
}
class B extends A
{
	int a=10,b=30;
	void Display()
	{
		System.out.println("Display of method B");
		super.Display();

	}
	void Addition()
	{
		int c = a + b;
		System.out.println("Addition = "+c);
		
	}
	void Calculate()
	{
		super.Calculate(20,3);
		System.out.println("Calculate Method of B class");
	}

}
class InheritanceSample
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.Display();
		b1.Addition();
		b1.Calculate();
	}
}
