import java .util.*;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Details you want to store:");
		int n = sc.nextInt();
		int[] rollno = new int[n];
		String[] name = new String[n];
		float[] cgpa = new float[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Roll no.: ");
			rollno[i] = sc.nextInt();
			System.out.println("Enter Name: ");
			name[i] = sc.next();
			System.out.println("Enter CGPA.: ");
			cgpa[i] = sc.nextFloat();
			
		}
		System.out.println("------Student Details------");
		System.out.print("\nROLLNO\tNAME\tCGPA");
		for(int i=0;i<n;i++)
		{
			System.out.print("\n"+rollno[i]+"\t"+name[i]+"\t"+cgpa[i]+"\n");
		}
	
	}
}
