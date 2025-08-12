import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size=sc.nextInt();
		
		int[] a=new int[size];
		System.out.println("Enter "+size+" Elements : ");
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();

		int[] b=new int[a.length];
		/*
		for(int i=(a.length-1)/2,x=0;i>=0;i--,x++)
			b[x]=a[i];
		for(int j=((b.length-1)/2)+1,x=((a.length-1)/2)+1;j<b.length;j++,x++)
			b[j]=a[x];
		System.out.println("Result Array : ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		*/
		int mid=(a.length)/2;
		for(int i=0,x=0;x<mid;x++,i++)
			b[i]=a[x];
		for(int i=((b.length-1)/2)+1,x=a.length-1;x>=mid;x--,i++)
			b[i]=a[x];
		System.out.println("Result Array : ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
}