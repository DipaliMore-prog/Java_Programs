class Prime
{
	public static void main(String args[])
	{
		int n=3;
		if(isprime(n))
		{
			System.out.println("Is prime No.");
		}
		else
		{
			System.out.println("Is Not prime No.");			
		}	
	}
	public static boolean isprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
