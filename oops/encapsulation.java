class Account
{
	public String name;
	private int balance;
	void setname(String name)
	{
		this.name=name;
	}
	void setbalance(int balance)
	{
		this.balance=balance;
	}
	String getname()
	{
		return name;
	}
	int getbalance()
	{
		return balance;
	}
}
class Main
{
	public static void main(String[] args)
	{
		Account a=new Account();
		a.setname("sai ganesh");
		a.setbalance(200000);
		System.out.println(a.getname()+"  --> "+a.getbalance());
	}
}