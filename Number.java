import java.util.Scanner;
public class Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt;
		int pcount=0,ncount=0,zcount=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem==0)
				zcount++;
			else if(rem>0)
				pcount++;
			else
				ncount++;
			num/=10;
		}
		System.out.println("Zero count in "+num+" is : "+zcount);
		System.out.println("Positive count in "+num+" is : "+pcount);
		System.out.println("Negative count in "+num+" is : "+ncount);

	}
}