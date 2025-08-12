public resturantBill
{
public static void main(String args[])
{
	String name="SATTI BABU BIRYANI POINT";
	String address="3-11,kphb,near jntu,Hyderabad";
	String phno="8125294053";

	String itemName1="Soup";
	double price1=149;
	int quantity1=3;

	String itemName2="chicken 65";
	double price2=265;
	int quantity2=5;

	String itemName3="Biryani";
	double price3=300;
	int quantity3=2;

	String itemName4="Water";
	double price4=25;
	int quantity4=2;

	String itemName5="Icecream";
	double price5=79;
	int quantity5=3;

	double cost1=price1*quantity1;
	double cost2=price2*quantity2;
	double cost3=price3*quantity3;
	double cost4=price4*quantity4;
	double cost5=price5*quantity5;
	double totalPrice=cost1+cost2+cost3+cost4+cost5;

	double cgst=9.0/100*totalPrice;
	double sgst=9.0/100*totalPrice;
	double gst=cgst+sgst;

	double totalCost=totalPrice+gst;
	double discount=15.0/100*totalCost;
	double totalBill=totalCost-discount;

	System.out.println("\n\t"+name);
	System.out.println("\n\t"+address);
	System.out.println("\n\t  "+phno);

	System.out.println("----------------------------------------------");

	System.out.println("ITEM NAME\tPRICE\tQUANTITY\tCOST\n");
	System.out.println(itemName1+"\t\t"+price1+"\t   "+quantity1+"\t\t"+cost1);
	System.out.println(itemName2+"\t"+price2+"\t   "+quantity2+"\t\t"+cost2);
	System.out.println(itemName3+"\t\t"+price3+"\t   "+quantity3+"\t\t"+cost3);
	System.out.println(itemName4+"\t\t"+price4+"\t   "+quantity4+"\t\t"+cost4);
	System.out.println(itemName5+"\t"+price5+"\t   "+quantity5+"\t\t"+cost5);

	System.out.println("----------------------------------------------");
	System.out.println("TotalPrice\t\t\t\t"+totalPrice);
	System.out.println("----------------------------------------------");
	System.out.println("Cgst(9%)\t\t\t\t"+cgst);
	System.out.println("sgst(9%)\t\t\t\t"+sgst);
	System.out.println("----------------------------------------------");
	System.out.println("Gst(18%)\t\t\t\t"+gst);
	System.out.println("----------------------------------------------");
	System.out.println("TotalCost\t\t\t\t"+totalCost);
	System.out.println("Discount(15%)\t\t\t\t"+discount);
	System.out.println("----------------------------------------------");
	System.out.println("TotalBill\t\t\t\t"+totalBill);
	System.out.println("\n\t-------THANK YOU VISIT AGAIN-------");
}
}