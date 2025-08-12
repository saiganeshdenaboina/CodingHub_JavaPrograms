public class Products
{
	public static void main(String [] args)
	{
		int n=10,sum=0,product=1;
		for(int i=1;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
				product=product*i;
			}
		}
		System.out.println("Sum of Factors:"+sum);
		System.out.println("Product of Factors:"+product);
		if(sum==product)
			System.out.println(n+" is Perfect Number");
		else
			System.out.println(n+" is not a Perfect Number");
		
	}
}