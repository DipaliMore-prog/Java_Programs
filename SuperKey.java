class A
{
	int a = 20;
}
class B extends A
{
	int a = 30;
	void show()
	{
		System.out.println(a + a);
		System.out.println(a + super.a);
	}
}
class SuperKey
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
	}
}
