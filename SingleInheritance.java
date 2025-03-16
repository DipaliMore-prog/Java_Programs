
import java.util.*;
final class Super
{
	   Scanner sc = new Scanner(System.in);
		void Accept()
		{
			
			int rollno;
			String prnno;
			System.out.println("Enter Roll No. :");
			rollno = sc.nextInt();
			System.out.println("Enter PRN No. :");
		    prnno = sc.next();
		}
		void DisplayD()
		{
			System.out.println("Roll No. ="+rollno);
			System.out.println("PRN No. = "+prnno);
		}
		
	
}
class Derived 
{
	    Scanner sc = new Scanner(System.in);
		String sub1 = sc.next();
		String sub2 = sc.next();

		void Display()
		{
			
			System.out.println("Subject 1 = "+sub1);
			System.out.println("Subject 2 = "+sub2);
		
		}
		
}
class SingleInheritance
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		Super s = new Super();
		s.Accept();
		s.DisplayD();
		d.Display();
	}
}

