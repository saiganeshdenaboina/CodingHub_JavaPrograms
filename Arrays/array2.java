import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		System.out.println("Enter 6 Elements : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		reverse r=new reverse();
		int[] rev=r.check(a);
		
		System.out.println("Reversed array :");
		for(int n:rev)
			System.out.println(n+" ");
		
	}
}
class reverse
{
	int[] check(int[] n)
	{
		int[] rev=new int[n.length];
		for(int i=0;i<n.length;i++)
			rev[i]=n[n.length-1-i];
		return rev;
	}
}