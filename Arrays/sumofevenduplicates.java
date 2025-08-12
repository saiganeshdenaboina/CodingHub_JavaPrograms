class Main
{
	public static void main(String[] args)
	{
	
		int[] a=new int[]{10,20,30,10,20,56,39,56,10,45,56};
		boolean[] b=new boolean[a.length];
		int sum=0;
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
			if(count>1 && count%2==0)
			{
				System.out.println(a[i]);
			}
			if(count>1 && a[i]%2==0)
			{
				sum+=a[i];
				//System.out.println(a[i]);
			}
		}
		System.out.println("sum of even duplicate elements are : "+sum);
		/*
		int[] a=new int[]{1,2,3,4,5,6,7,8,9};
		boolean[] b=new boolean[a.length];
		boolean found=true;
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
				System.out.println(a[i]);
				found=false;
			}
		}
		if(found)
			System.out.println("No duplicates are found");
		*/
		
	}
}