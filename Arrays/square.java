class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{3,5,4,7};
		int[] b=new int[a.length];

		square s=new square();
		int[] c=s.check(a,b);

		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
	}
}
class square
{
	int[] check(int[] a,int[] b)
	{
		
		for(int i=0,j=0;i<a.length;i++,j++)
		{
			b[j]=(int)Math.pow(a[i],2);
			
		}
		return b;
	}
}