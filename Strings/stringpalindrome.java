class Main
{
	public static void main(String[] args)
	{
		String s="madam";
		char[] a =s.toCharArray();
		int l=0,r=a.length-1;
		Boolean flag=true;
		while(l<=r)
		{
			if(a[l]!=a[r])
			{
				flag=false;
				break;
			}
			l++;
			r--;
		}
		if(flag)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}