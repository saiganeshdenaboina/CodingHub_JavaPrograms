public class Nestedif
{
	public static void main(String [] args)
	{
		if(true)
		{
			System.out.println("in outer if");
			if(false)
			{
				System.out.println("first inner if");
				if(true)
				{
					System.out.println("second inner if");
				}
			}else
			{
				System.out.println("first inner if is false");
			}	
		}else
		{
			System.out.println("outer if is false");
		}
	}
}