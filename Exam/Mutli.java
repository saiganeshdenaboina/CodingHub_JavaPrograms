public class Multi
{
	public static void main(String[] args)
	{
		int n=20;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)	
				System.out.println(i+" x "+j+" = "+(i*j));
		}
	}
}