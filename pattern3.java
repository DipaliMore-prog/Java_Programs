class pattern3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j>=i;j++)
			{
				for(int k=j;k<j-1;k++)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("*");
		}
	}
}
