class Main
{
	public static void main(String[] args)
	{
		Evil e=new Evil();
		int num=e.n=45;
		int square=e.number();
		int adding=e.add(square);
		e.compare(num,adding);
	}
}
class Evil
{
	int n;
	int number()
	{
		return n*n;
	}
	int add(int square)
	{
		int sum=0;
		while(square>0)
		{
			sum+=square%10;
			square/=10;
		}
		return sum;
	}
	void compare(int num,int add )
	{
		System.out.println(num==add?"Evil":"Not Evil");
	}
}