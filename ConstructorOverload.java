class ConstructorOverload
{
	int id,rollno;
	String name;
	ConstructorOverload(int i,String n)
	{
		id = i;
		name = n;
		System.out.println("Id = "+id+"\n"+"Name = "+name);
	}
	ConstructorOverload(int i,String n,int r)
	{
		id = i;
		name = n;
		rollno = r;
		System.out.println("Id = "+id+"\n"+"Name = "+name+"\n"+"Roll No = "+rollno);
	}
	public static void main(String args[])
	{
		ConstructorOverload p = new ConstructorOverload(1, "Dipali");

		ConstructorOverload p2 = new ConstructorOverload(2, "Chaitali", 149);

		ConstructorOverload p3 = new ConstructorOverload(3, "Vaishnavi", 137);
	}
}
