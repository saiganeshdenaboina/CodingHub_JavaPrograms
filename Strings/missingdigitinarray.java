class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,4,8,9};
		boolean[] b=new boolean[10];

		for(int x:a)
		{
			if(x>=0 && x<=9)
				b[x]=true;
		}
		for(int i=0;i<b.length;i++)
		{
			if(!b[i])
				System.out.print(i+" ");
		}
		
	}
}