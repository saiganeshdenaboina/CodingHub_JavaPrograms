class Loops

{
	public static void main(String[] args)
	{
		int num=5698273,eCount=0,oCount=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				System.out.println(rem);
				eCount++;
			}else
			{
				oCount++;
			}
			num/=10;			
		}
		System.out.println("Even Count "+eCount);
		System.out.println("Odd Count "+oCount);
		
		
	}
}