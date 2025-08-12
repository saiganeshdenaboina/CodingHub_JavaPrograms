class Main
{
	public static void main(String[] args)
	{
		Student s=new Student(10);
	}
}
class Student
{
	Student(int roll)
	{
		this();
		System.out.println("parameterized constructor"+roll);
		
	}
	Student()
	{
		this("sai");
		System.out.println("default constructor");
	}
	Student(String name)
	{
		this(20);
		System.out.println("String "+name);
	}
}
