class Main
{
	public static void main(String[] args)
	{
		String s="hello world good morning";
		String[] a=s.split(" ");
		int max=0,smax=-1;
		String smaxword="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>a[max].length())
			{
				smax=max;
				max=i;
			}
			else if(smax==-1||a[i].length()>a[smax].length() && a[i].length()<a[max].length())
			{
				smax=i;
			}
			if(a[i].length()==a[smax].length())
				smaxword+=a[i]+" ";
		}
		
		System.out.print(smaxword+" ");
	}
}