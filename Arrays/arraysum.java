class Main
{
	public static void main(String[] args)
	{
		Main m=new Main();
		int[] a=new int[]{1,2,3,4,5};
		m.sumof(a,0,0);
	}
	void sumof(int[] a,int start,int sum)
	{
		if(start>a.length-1)
		{
			System.out.println("sum of array is : "+sum);
		}
		else
		{
			sum+=a[start];
			start++;
			sumof(a,start,sum);
		}
	}
}