class Main
{
	public static void main(String[] args)
	{
		int[] d=new int[]{2,5,8,10,6};
		int[] e=new int[d.length];
		fib f=new fib();
		for(int temp:f.cal(d,e))
			System.out.print(temp+" ");
		
	}
}
class fib
{
	int[] cal(int[] d,int[] e)
	{
		for(int i=0;i<d.length;i++)
		{
	
			int a=0,b=1,c=0;
			for(int x=0;x<d[i];x++)
			{
				a=b;
				b=c;
				c=a+b;
			}
			e[i]=c;
		}	
		return e;
	}
}