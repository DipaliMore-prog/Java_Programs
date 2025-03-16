class Armstrong
{
	public static void main(String args[])
	{
		int n=153,rev=0,sum=0;
        int i = n;
		while(n>0)
		{
			rev = n%10;
			sum = sum + (rev * rev * rev);
			n = n/10;
			
		}
		System.out.println("Addition of cubes of Digit in number ="+sum);
		if(sum == i)
		{
			System.out.println("No. is Armstrong");
		}
	}
		
}
