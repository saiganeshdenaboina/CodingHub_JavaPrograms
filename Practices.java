public class Practices
{
	public static void main(String[] args)
	{
		int n1=20,n2=15,great=0;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				great=i;
		
			}
			
		}
		System.out.println(great);
	}
}
