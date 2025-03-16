class Pattern2
{
	public static void main(String args[])
	{
		int a=3,b=4,sum;
		for(int i=1;i<=5;i++)
		{
			sum = a + b;
			*System.out.println(a+"\t "+b+"\t"+sum+"\t");
			a = sum;
			b++;
		}


