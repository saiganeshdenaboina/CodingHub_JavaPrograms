class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{-1,9,8,-1,6,-9,7};
		int[] b=new int[a.length];

		pos p=new pos();
		for(int temp:p.check(a,b))
			System.out.print(temp+" ");
	}
}
class pos
{
	int[] check(int[] a,int[] b)
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				b[x++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				b[x++]=a[i];
		}
		return b;
	}
}