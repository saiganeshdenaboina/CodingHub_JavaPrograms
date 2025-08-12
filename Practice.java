import java.util.Scanner;
public class Practice
{
	public static void main(String[] args)
	{
		/*
		int num=74839309,count=0,ecount=0,ocount=0;
		while(num!=0)
		{
			count++;
			int rem=num%10;
			if(count==1||count==4||count==8)
			{
				System.out.println(rem+" --> "+count);
				ecount+=rem;
			}else if(count==2||count==5||count==7)
			{
				System.out.println(rem+"-->"+count);
				ocount+=rem;
			}
			num/=10;
		}
		System.out.println(ecount);
		System.out.println(ocount);

		*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int temp=num,count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		int num1=count/2;
		int divisor=(int)(Math.pow(10,num1));
		System.out.println(divisor);
		int secondhalf=temp%divisor;
		int firsthalf=temp/divisor;

		System.out.println("First Half  : "+firsthalf);
		System.out.println("Second Half  : "+secondhalf);
		
		sc.close();
		
	
		*/
		//153,370,371,407,1634 are armstrong numbers
		/*
		int num=1637,count=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		int sum=0;
		num=temp;
		while(num!=0)
		{
			int rem=num%10;
			sum+=(int)(Math.pow(rem,count));
			num/=10;
		}
		if(temp==sum)
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
		
		*/
		//given numbers is prime or not
		int  num=74839,count=0,temp=num;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		int rem=temp%10;
		
		
		



























	}
}
