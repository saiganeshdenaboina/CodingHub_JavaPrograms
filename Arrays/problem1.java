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
		
		int[] b=new int[(size+1)/2];
		int[] c=new int[size/2];
		
		int bindex=0,cindex=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				b[bindex++]=a[i];
			else
				c[cindex++]=a[i];
		}
		System.out.print("Even index Elements : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		System.out.print("Odd index Elements : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}