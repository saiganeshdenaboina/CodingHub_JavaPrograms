class Main
{
	public static void main(String[] args)
	{
		/*
		int[]n={10,20,30,40,50};
		int max=n[0],min=n[0];
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>max)
				max=n[i];
			if(n[i]<min)
				min=n[i];
		}
		System.out.println(max+" "+min);
		*/
		//sum of even numbers
		/*
		int[] num={2,49,57,2,10,3,8};
		int esum=0,osum=0,ecount=0,ocount=0,diff=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				ecount++;
				esum+=num[i];
			}
			else
			{
				ocount++;
				osum+=num[i];
			}
		}
		diff=esum-osum;
		System.out.println(esum+" "+osum+" counts of even and odd are:"+ecount+" "+ocount+"difernce "+diff);
		*/
		

		//print array in reverse order
		/*
		int[] n={1,2,3,4,5,6,7,8};
		for(int i=n.length-1;i>=0;i--)
		{
			System.out.println(n[i]);
		}
		*/
		//count the digits greater than 50 and print them
		/*
		int[] n={10,58,39,95,85,29,19,49,53};
		int count=0;
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>50)
			{
				count++;
				 System.out.println(n[i]);	
			}
		}
		System.out.println(count);
		*/
		/*
		//find sum numbers present at even index 
		int[] num = {12, 45, 67, 23, 89, 34, 56, 90, 11};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(i%2==0)
			{
				sum+=num[i];
				System.out.println(num[i]);
			}	
		}
		System.out.println(sum);
		*/
		//Find the Difference Between Maximum and Minimum Numbers
		/*
		int[] num = {12, 45, 67, 23, 89, 34, 56, 90, 11};
		int max=num[0],min=num[0],diff=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}
		diff=max-min;
		System.out.println("Maximum :"+max+" Minimum :"+min +" Difference :"+diff);
		*/
		//count&print numbers divisible by 5
		
		int[] num = {12, 45, 67, 23, 89, 34, 56, 90, 11, 50, 25};
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%5==0)
			{
				count++;
				System.out.println(num[i]);
			}
		}
		System.out.println("Count of numbeers divisible by 5 is :"+count);






		
	}
}