class GrossSalary
{
	public static void main(String args[])
	{
		int sal=20000;
		int pension=2000;
		double tax=pension*0.35;
		double grosssal=sal-pension-tax;
        System.out.println("Salary of this Month :"+grosssal);
	} 
}
