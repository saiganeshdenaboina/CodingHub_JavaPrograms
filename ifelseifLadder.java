import java.util.Scanner;
public class ifelseifLadder
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Student name : ");
		String name=sc.nextLine();

		System.out.println("Student Roll No : ");
		int rollNumber=sc.nextInt();

		System.out.println("Student Section :");
		char section=sc.next().charAt(0);

		System.out.println("Enter marks for 5 subjects:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();

		int total=m1+m2+m3+m4+m5;

		double percentage=total/500.0*100;
		
		System.out.println("\n--- Student Report ---");
		System.out.println("Name       : " + name);
		System.out.println("Roll No.   : " + rollNumber);
		System.out.println("Section    : " + section);
		System.out.println("Total Marks: " + total + "/500");
		System.out.printf("Percentage  : " +percentage);


		if(percentage >= 90 && percentage <=100)
		{
			System.out.println("\nGrade : A+");
		}else if(percentage >= 80 && percentage < 90)
		{
			System.out.println("\nGrade : A ");
		}else if(percentage >= 70 && percentage < 80)
		{
			System.out.println("\nGrade : B ");
		}else if(percentage >= 60 && percentage < 70)
		{
			System.out.println("\nGrade : C");	
		}else if(percentage >= 45 && percentage < 60)
		{
			System.out.println("\nGrade :  D");
		}else if(percentage >= 35 && percentage < 45)
		{
			System.out.println("\nGrade : E ");
		}else if(percentage >= 0 && percentage < 35)
		{
			System.out.println("\nGrade : F");
		}else
		{
			System.out.println("\ninvalid marks");
		}
          	sc.close();
		
	}
}