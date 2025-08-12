import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] num=new int[6];
		System.out.print("Enter 6 elements : ");
		for(int i=0;i<num.length;i++)
			num[i]=sc.nextInt();
		int pos=num.length-1;
		int n=25;

		Insert i=new Insert();
		int[] result=i.element(num,pos,n);
		System.out.print("After Insertion : ");
		for(int temp:result)
			System.out.print(temp+" ");
		
		
	}
}
class Insert
{
	int[] element(int[] num,int pos,int n)
	{
		for(int i=num.length-1;i>pos;i--)
		{
			num[i]=num[i-1];
				
		}
		num[pos]=n;
		return num;
	}
}