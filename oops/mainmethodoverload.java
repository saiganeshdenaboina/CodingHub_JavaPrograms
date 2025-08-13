class mainmethodoverload
{
	public static void main()
	{
		System.out.println("main1 ");
	}
	public static void main(int x)
	{
		System.out.println("main2 "+x);
	}
	public static void main(String[] args)
	{
		mainmethodoverload m=new mainmethodoverload();	
		m.main();
		m.main(5);
	}
}

