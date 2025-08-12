class Prime
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{21,67,44,11,34,7,98,37};
		System.out.println("Primes are in the array is : ");
		for(int x=0;x<arr.length;x++)
		{
			int factor=0;
			for(int y=1;y<=arr[x];y++)
			{
				if(arr[x]%y==0)
					factor++;
			} 
			if(factor==2)
				System.out.println(arr[x]);
		}
	}
}