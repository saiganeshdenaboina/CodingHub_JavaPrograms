class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{-10,-1,-28,-26,-16,-388,-151};

		Max m=new Max();
		int[] res=m.checkmax(a);
		System.out.println("Maximum Value in the Array is : "+res[0]+"\n"+
				    "Second Maximum Value in the Array is : "+res[1]+"\n"+
				   "Minimum value in the Array is : "+res[2]+"\n"+
				   "Second Minimum Value in the Array is : "+res[3]);
			
	}
}
class Max
{
	
	int[] checkmax(int[] a)
	{
		 int max = Integer.MIN_VALUE;
        	 int secondmax = Integer.MIN_VALUE;
       		 int min = Integer.MAX_VALUE;
       		 int secondmin = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
			}
			else if(a[i]>secondmax && a[i]!=max)
			{
				secondmax=a[i];
			}
			if(a[i]<min)
			{
				secondmin=min;
				min=a[i];
			}
			else if(a[i]<secondmin && a[i]!=min)
			{
				secondmin=a[i];
			}
		}
	
		return new int[]{max,secondmax,min,secondmin};
	}
	
}