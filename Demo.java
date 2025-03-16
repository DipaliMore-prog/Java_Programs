class Sample
{
   int rollno=152;
	char div ='A';
	String name="Dipali";
	void show()
	{
		System.out.println("Roll No="+rollno);
		System.out.println("Div="+div);
		System.out.println("Name="+name);
	}
}
class Demo{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.show();
	}
}
