import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int size=sc.nextInt();
		
		int[] a=new int[size];
		System.out.print("Enter "+size+" Elements : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Enter Search Element : ");
		int found=sc.nextInt();

		boolean isfound=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==found)
			{
				System.out.println("Element found at "+i+" index ");
				isfound=false;
				break;
			}
		}
		if(isfound)
			System.out.println("Element not found");
		
	}
}