class Super
{
	int a =10;
	int b = 20;
}
class Sub1 extends Super
{
	void showAdd()
	{
		System.out.println("Addition of A and B = "+(a+b));
	}
}
class Sub2 extends Super
{

	void showSub()
	{

		System.out.println("Subtraction of A and B = "+(a-b));
	}
			
}
class HierarchicalInh
{
	public static void main(String args[])
	{
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2();
		s1.showAdd();
		s2.showSub();
	}

}
