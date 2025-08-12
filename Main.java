public class Main
{
public static void main(String[] args)
{
int emop_id=401;
String name="sai ganesh";
double gross_sal=50000;
int travel=13;
int pf=15;
int tax=5;
double travel_all=gross_sal/travel*100;
System.out.println(travel_all);
double profit=gross_sal/pf*100;
System.out.println(profit);
double tax_rate=gross_sal/tax*100;
System.out.println(tax_rate);
double totalsal_reduction=travel_all+profit+tax_rate;
System.out.println(totalsal_reduction);
}
}