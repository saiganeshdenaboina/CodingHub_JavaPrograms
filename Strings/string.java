class Main
{
	public static void main(String[] args)
	{
		String s1=new String("Hel$lo al3l good8 m&orning5");
		s1=s1.toLowerCase();
		char[] a=s1.toCharArray();
		String vowel="";
		String conso="";
		String num="";
		String sym="";
		for(int x=0;x<a.length;x++)
		{
			if(a[x]=='a'||a[x]=='e'||a[x]=='i'||a[x]=='o'||a[x]=='u')
				vowel+=a[x];
			else if(a[x]>='0' && a[x]<='9')
				num+=a[x];
			else if(a[x]>='a' && a[x]<='z')
				conso+=a[x];
			else
				sym+=a[x];
			
		}
		System.out.println(vowel);
		System.out.println(num);
		System.out.println(conso);
		System.out.println(sym);
	}
}