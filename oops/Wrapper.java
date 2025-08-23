class Wrapper
{
	public static void main(String[] args)
	{
		Integer x=10;
		System.out.println(System.identityHashCode(x));
		x=20;
		System.out.println(System.identityHashCode(x));
	}
}