import java.util.Scanner;
class ScannerClass{
	public static void main(String args[])
	{
		int rllno;
		String name,prn;
		double cgpa,fees;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No:");
		rllno = sc.nextInt();
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter PRN No:");
		prn = sc.next();
		System.out.println("Enter CGPA:");
		cgpa = sc.nextDouble();
		System.out.println("Enter FEES:");
		fees = sc.nextDouble();
		System.out.println("Roll no="+rllno);
		System.out.println("Name="+name);
		System.out.println("PRN no="+prn);
		System.out.println("CGPA="+cgpa);
		System.out.println("FEES="+fees);
	}
}
