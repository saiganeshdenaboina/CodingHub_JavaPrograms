public class Common
{
	public static void main(String[] args)
	{
		int num1=1183922,temp1=num1,result=0;
		while(num1>0)
		{
			int rem=num1%10;
			int num2=1162298,temp=num2;
			while(num2>0)
			{
				int rem2=num2%10;
				if(rem==rem2 && rem!=result)
				{
					result=rem2;
					System.out.println(" Common digits of "+temp1+" and "+temp+" is : "+result);
					break;
				}
				num2/=10;
			}
			num1/=10;
		}
		
	}
}