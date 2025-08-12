class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{5,14,19,28,14,16,20,10};
		int[] b=new int[a.length];
		Add s=new Add();
		for(int temp:s.swap(a,b))
			System.out.println(temp);
		
	}
}
class Add
{
	int[] swap(int[] a,int[] b)
	{

		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				b[i]=a[i]+a[i+1];
			}else if(i==a.length-1)
			{
				b[i]=a[i-1]+a[i];
			}
			else 
			{
				b[i]=a[i+1]+a[i-1];
			}
		
		}
		return b;
	}	
}