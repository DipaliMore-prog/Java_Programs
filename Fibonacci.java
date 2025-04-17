class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c,n=5;
		if(n == 1)
		{
			System.out.println(a);		
			return;		
		}
		for(int i=2;i<n;i++)
		{
			c=a+b;
            System.out.println("Fibonacci Series is:"+a);
			a=b;
			b=c;

		}
     
		

	}
}
