class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,2,3,4,5,8,4,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]==a[j+1])
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}