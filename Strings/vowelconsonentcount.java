class Main
{
	public static void main(String[] args)
	{
		String s=new String("Hello All Good Evening");
		char[] a=s.toCharArray();
		int vowel=0,con=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]=='a'||a[x]=='e'||a[x]=='i'||a[x]=='o'||a[x]=='u')
				vowel++;
			else
				con++;
		}
		System.out.println("Vowels count is : "+vowel);
		System.out.println("Consonent count is : "+con);
		
	}
}