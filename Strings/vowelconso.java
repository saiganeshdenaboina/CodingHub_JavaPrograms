class Main
{
	public static void main(String[] args)	
	{
		String s="hello";
		s=s.toLowerCase();
		int v=0,c=0;
		for(char ch:s.toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
				v++;
			else if(ch>='a'&&ch<='z')
				c++;
		}
		System.out.println("vowels : "+v+"\t"+"consonants : "+c);
	}
}