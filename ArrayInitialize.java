import java .util.*;
class ArrayInitialize
{
	public static void main(String args[])
	{
		int[] rollno = {1,2,3,4,5};
		String[] name = {"DM","CR","VP","SH","SD"};
		float[] cgpa = {7.86F,8.91F,8.77F,8.68F,8.36F};
		System.out.println("------Student Details------");
		System.out.print("\nROLLNO\tNAME\tCGPA");
		for(int i=0;i<5;i++)
		{
			System.out.print("\n"+rollno[i]+"\t"+name[i]+"\t"+cgpa[i]+"\n");
			
		}
	
	}
}
