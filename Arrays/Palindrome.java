class Palindrome
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{121,146,818,950,676,363};
		for(int x=0;x<arr.length;x++)
		{
			int rev=0,temp=arr[x];
			while(arr[x]>0)
			{
				rev=rev*10+(arr[x]%10);
				arr[x]/=10;
			}
			if(temp==rev)
			System.out.println(temp);
		}
	}
}