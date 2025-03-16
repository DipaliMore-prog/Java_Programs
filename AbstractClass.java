abstract class printable
{
	abstract void print();
}
class AbstractClass extends printable
{
	public void print()
	{
		System.out.println("Abstract Class Method");
	}
	public static void main(String args[])
	{
		AbstractClass a = new AbstractClass();
		a.print();
	}
}
