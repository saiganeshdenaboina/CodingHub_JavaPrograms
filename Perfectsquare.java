class Perfectsquare
{	public static void main(String[] args)
	{
		int num=27;
		//while(num!=0)
		//{
			//int rem=num%10;
			double d=Math.cbrt(num);
			int b =(int)d;
			System.out.println((d==b)?(num+" perfect cube"):(num+" not a perfect cube"));
			//num/=10;
		//}
	}
}