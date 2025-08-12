class Main
{
	public static void main(String[] args)
	{
		String s1="Hello All5 9  Good Mor1ning$";
		char[] a=s1.toCharArray();
		int upper=0,lower=0,space=0,num=0,symbol=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>='A'&&a[x]<='Z')
				upper++;
			else if(a[x]>='a'&&a[x]<='z')
				lower++;
			else if(a[x]==' ')
				space++;
			else if(a[x]>='0'&&a[x]<='9')
				num++;
			else
				symbol++;
		}
		System.out.println("Upper case : "+upper);
		System.out.println("Lower case : "+lower);
		System.out.println("space : "+space);
		System.out.println("numbers : "+num);
		System.out.println("symbol : "+symbol);
	}
}