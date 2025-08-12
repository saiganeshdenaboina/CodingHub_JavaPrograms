class Main
{
	public static void main(String[] args)
	{
		String s=new String("hello all good morning");
		s=s.toLowerCase();
		String[] a=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String temp=a[x];
			char[] c=temp.toCharArray();
			int vowel=0;
			for(int y=0;y<c.length;y++)
			{
				switch (c[y])
				{
					case'a','e','i','o','u':
						vowel++;
				}
			}
			System.out.println(temp+" => vowels count is : "+vowel);
		}
		
	}
}