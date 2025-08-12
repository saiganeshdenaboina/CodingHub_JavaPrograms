class Armstrong
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{153,287,370,293,407,748,371};
		System.out.println("Armstrong numbers in the array is :");
		for(int x=0;x<arr.length;x++)
		{
			int num=arr[x],count=0,temp=num,sum=0;
			while(num>0)
			{
				count++;
				num/=10;
			}
			num=temp;
			while(num>0)
			{
				sum+=(int)Math.pow(num%10,count);
				num/=10;
			}
			if(temp==sum)
				System.out.println(arr[x]);
			
		}
	}
}