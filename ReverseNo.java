class ReverseNo
{
	public static void main(String args[])
	{
		int n=123,rev=0,sum=0;
		while(n>0)
		{
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
			
		}
		System.out.println("Reverse Number="+sum);
	}
}
