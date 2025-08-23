class  Main
{
	public static void main(String[] args)
	{
		parent parent=(x,y)->
		{
			return x+y;
			//System.out.println("m1 method using lambda method");
		};
		System.out.println(parent.m1(7,7));
	}
}
@FunctionalInterface
interface parent
{
	public int m1(int x,int y);
}