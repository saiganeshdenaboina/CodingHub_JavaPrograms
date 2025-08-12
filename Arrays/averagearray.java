class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,3,4,5};

		average r=new average();
		System.out.println("Average of an Array is : "+r.check(a));
	}
}
class average
{
	int check(int[] a)
	{
		int sum=0,count=0;
		for(int i=0;i<a.length;i++)
			count++;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int average=sum/count;
		return average;
	}
}