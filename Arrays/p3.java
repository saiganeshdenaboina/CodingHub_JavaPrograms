import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int[] b=new int[a.length];
		for(int i=0;i<=(a.length-1)/2;i++)
			b[i]=a[i];	
		for(int x=a.length-1, y=((b.length-1)/2)+1;x>(a.length-1)/2;x--,y++)
			b[y]=a[x];
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
	}
}