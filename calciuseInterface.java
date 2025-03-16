import java .util.*;
interface Add
{
	public void Addition();
}
interface Sub
{
	public void Subtraction();
}
/*interface Mul
{
	void Multiplication();
}
interface Div
{
	void Division();
}*/
class calciuseInterface implements Add,Sub//,Mul,Div
{
	
	public void Addition()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition = "+(a+b));
	}
	public void Subtraction()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Subtraction = "+(a-b));
	}
	public static void main(String args[])
	{
		Add a1 = new calciuseInterface();
		a1.Addition();
		Sub b = new calciuseInterface();
		b.Subtraction();
	}
}

