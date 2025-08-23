interface Bank
{
	public void getMaxTranscation();
	public void getMinBalance();
	public void getMaxBalance();
	public void getLoanIntrest();
	default void getlocation()
	{
		System.out.println("hyderbad");
	}	
}
class Hdfc implements Bank
{
	public void getMaxTranscation()
	{
		System.out.println("maxmimum transcations in hdfc");
	}	
	public void getMinBalance()
	{
		System.out.println("minimum balance in hdfc");
	}		
	public void getMaxBalance()
	{
		System.out.println("maxmimum  balance in hdfc");
	}	
	public void getLoanIntrest()
	{
		System.out.println("Loan intrest in hdfc");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Bank b=new Hdfc();
		b.getMaxTranscation();
		b.getMinBalance();
		b.getMaxBalance();
		b.getLoanIntrest();
		b.getlocation();
	}
}