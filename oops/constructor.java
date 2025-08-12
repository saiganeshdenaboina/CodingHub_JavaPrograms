class Main
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.print();
		Student s2=new Student(20,"ganesh","A");
		s2.print();
	}
}
class Student
{
	int roll;
	String name;
	String grade;

	Student()
	{
		roll=9;
		name="sai";
		grade="B";
	}
	Student(int roll,String name,String grade)
	{
		this.roll=roll;
		this.name=name;
		this.grade=grade;
	}
	void print()
	{
		System.out.println(roll+" "+name+" "+grade);
	}
}