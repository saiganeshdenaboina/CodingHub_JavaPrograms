interface Bank
{
	public void getMaxTranscation();
	public void getMinBalance();
	public void getMaxBalance();
	public void getLoanIntrest();
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
class Sbi implements Bank
{
 	public void getMaxTranscation()
 	{
 		System.out.println("maxmimum transcations in SBI");
 	}
 	public void getMinBalance()
 	{
 		System.out.println("minimum balance in SBI");
 	}
 	public void getMaxBalance()
 	{
 		System.out.println("maxmimum  balance in SBI");
 	}
	public void getLoanIntrest()
 	{
 		System.out.println("Loan intrest in SBI");
 	}
}
class Axis implements Bank
{
 	public void getMaxTranscation()
 	{
 		System.out.println("maxmimum transcations in AXIS");
 	}
 	public void getMinBalance()
 	{
 		System.out.println("minimum balance in AXIS");
 	}
 	public void getMaxBalance()
 	{
 		System.out.println("maxmimum  balance in AXIS");
 	}
	public void getLoanIntrest()
 	{
 		System.out.println("Loan intrest in AXIS");
 	}
}
class Main
{
	public static void main(String[] args)
	{
		Hdfc h=new Hdfc();
		h.getMaxTranscation();
 		h.getMinBalance();
 		h.getMaxBalance();
 		h.getLoanIntrest();

		Sbi s=new Sbi();
		s.getMaxTranscation();
 		s.getMinBalance();
 		s.getMaxBalance();
 		s.getLoanIntrest();

		Axis a =new Axis();
		a.getMaxTranscation();
 		a.getMinBalance();
 		a.getMaxBalance();
 		a.getLoanIntrest();
		
	}
}	

