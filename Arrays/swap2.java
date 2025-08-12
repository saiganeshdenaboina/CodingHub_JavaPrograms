class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60};
		swap s=new swap();
		for(int temp:s.m1(a))
			System.out.print(temp+" ");
	}
}
class swap
{
	int[] m1(int[] a)
	{
		for(int i=0;i<=(a.length-1)/2;i++)
		{
			int temp=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=temp;
			
		}
		return a;
	}
}