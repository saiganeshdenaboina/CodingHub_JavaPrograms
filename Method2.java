class Main
{
	public static void main(String[] args)
	{
		Sample s=new Sample();
		System.out.println(s.calM1());
		System.out.println(s.calM2());
		System.out.println(s.calM3());
		System.out.println(s.calM4());
		System.out.println(s.calM5());
		String sc=s.calM4();
		System.out.println(sc);


	}
}
class Sample
{
	int calM1()
	{
		return 356;	
	}
	double calM2()
	{
		return 748.94;
	}
	char calM3()
	{
		return 'G';
	}
	String calM4()
	{
		return "Sai Ganesh";
	}
	boolean calM5()
	{
		return true;
	}
}
