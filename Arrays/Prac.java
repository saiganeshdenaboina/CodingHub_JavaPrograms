class Prac
{
	public static void main(String[] args)
	{
		int[] arr= new int[]{10,20,30,40,50};
		Meth m=new Meth();
		m.calSum(arr);
	}
}
class Meth
{
	int sum=0;
	int product=1;
	void calSum(int[] arr)
	{
		for(int num:arr)
		{
			sum+=num;	
			product*=num;
		}
		System.out.println("sum is : "+sum+" Product is "+product);
	}
}