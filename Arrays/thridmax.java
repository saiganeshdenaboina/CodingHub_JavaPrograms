class Main 
{
	public static void main(String[] args)
	{
		int[] a=new int[]{17,13,90,12,89,45,37,23,78,49,10,544,345};
		int max=0,smax=0,tmax=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[max]<a[i])	
			{
				tmax=smax;
				smax=max;
				max=i;
			}
			else if(a[i]>a[smax] && a[i]<a[max])
			{
				tmax=smax;
				smax=i;
			}
			else if(a[i]>a[tmax] && a[i]<a[smax])
			{
				tmax=i;
			}
		}
		System.out.println(a[max]);
		System.out.println(a[smax]);
		System.out.println(a[tmax]);
	}
}