class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,10,20,56,39,56,10,45,56};
		boolean[] b=new boolean[a.length];
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count>1)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		System.out.println(max);
	}
}