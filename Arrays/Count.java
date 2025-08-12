class Main
{
	public static void main(String[] args)
	{
		int count=0;
		char[] ch=new char[]{'X','8','f','B','2','j','K','1','&',' ','4'};
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				count++;
			if(ch[i]>='a' && ch[i]<='z')
				System.out.println(ch[i]);
		} 
		System.out.println("Count of capital letters in Array is : "+count);
	}
}