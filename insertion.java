class Main
{
	public static void main(String[] args)
	{
		int[] num=new int[]{10,20,30,40,50};
		int pos=3;
		int n=25;
		for(int i=nums.length;i>pos;i--)
		{
			nums[i]=nums[i-1];
				
		}
		nums[pos]=25;
		nums.length++;
		for(int i:nums)
			System.out.println(i);
		
		
	}
}