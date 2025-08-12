class Sum
{
	int check(int[] a)
	{
		int sum=0;
		int min=0,max=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[min]>a[i])
				min=i;
			 if(a[max]<a[i])
				max=i;
		}
		sum=a[min]+a[max];
		return sum;
	}
}
	
class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50};
		Sum s=new Sum();
		System.out.println(s.check(a));
	}
}