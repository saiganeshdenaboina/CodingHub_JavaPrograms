class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{4,5,19,1,27,3};
		Min m=new Min();
		for(int temp:m.cal(a))
			System.out.print(temp+" ");
	}
}
class Min
{
	int[] cal(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				a[0]=a[i];
				a[i]=max;
				break;
			}
		}
		return a;
	}	
}