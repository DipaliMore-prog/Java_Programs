class Leap
{
	public static void main(String args[])
	{
		int year=2014;
		if(year%4 == 0)
		{
			System.out.println("Is a Leap year");
		}
		else if(year%400 == 0 || year%4 == 0)
		{
			System.out.println("Is a Leap year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}
}
