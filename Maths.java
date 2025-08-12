import java.util.Scanner;

public class Maths
{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter value of a:");
int a=input.nextInt();

System.out.println("enter value of b:");
int b=input.nextInt();

int c=a+b;
int d=a*b;

System.out.println(c);
System.out.println(d);
}
}