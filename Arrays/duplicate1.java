class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,10,20,56,39,56,10,45,56};
		boolean[] b=new boolean[a.length];

		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
				continue;
			int count=1;
			for(int y=i+1;y<a.length;y++)
			{
				if(a[i]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
				System.out.println(a[i]+" --> "+count);//it prints the duplicate elements in the array
			//if(count==1)
			//	System.out.print(a[i]+" ");//it prints the unique elements in the array
			//System.out.println(a[i]+" --> "+count);//it prints all elements atmost 1 time and its frequency	
		}
	}
}