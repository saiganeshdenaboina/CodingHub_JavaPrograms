class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40};
		int[] b=new int[a.length];
		one o=new one();
		int[] c=o.check(a,b);
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
	}
}
class one
{
		int[] check(int[] a,int[] b)
		{
			for(int i=a.length-1,y=0;i>=0;i--,y++)
				b[y]=a[i];
			return b;		
		}
}