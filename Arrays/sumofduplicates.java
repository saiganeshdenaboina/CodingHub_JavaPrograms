class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,10,20,56,39,56,10,45,56,56};
		boolean[] b=new boolean[a.length];
		int sum=0,max=0,min=Integer.MAX_VALUE,minelement=0,maxelement=0;
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
				//sum+=a[i];
				//System.out.println(a[i]+"-->"+count);
				if(count>max)
				{
					max=count;
					maxelement=a[i];
					//System.out.println(a[i]);
				}
				if(count<min)
				{
					min=count;
					minelement=a[i];
					//System.out.println(a[i]);
				}
			}
		}
		//System.out.println("sum of duplicates are : "+sum);
		System.out.println("Highest repetation element is : "+maxelement+ "\n" +
				   "Least repetation element is : "+minelement);
	}
}