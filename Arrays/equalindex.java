class Main
{
	public static void main(String[] args)
	{
		
		int[] a=new int[]{10,20,30,10};
		int[] b=new int[]{10,20,30,10};
		Boolean found=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				found=false;
				break;
			}
		}
		if(found)
			System.out.print("Elements is present in same index");
		else
			System.out.print(" elements is not present in same  index ");
		/*
		int[] a=new int[]{10,20,30,100};
		int[] b=new int[]{10,20,30,10};
		
		boolean found=true;
		for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					break;
				}
			}
			if(j==b.length)
			{
				found=false;
				break;
			}
		}
	
		if(found)
			System.out.print("Anagram");
		else
			System.out.print(" not anagram");
		*/

	}
}