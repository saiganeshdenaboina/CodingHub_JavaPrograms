class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};

		left l=new left();
		for(int temp1:l.check(a))
			System.out.print(temp1+" ");
	}
}
class left
{
	int[] check(int[] a)
	{
		for(int i=0;i<4;i++)
		{
			/*
			int temp=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[0]=temp;
			*/
			int temp=a[0];
			for(int x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[a.length-1]=temp;
		}
		return a;
	}
}