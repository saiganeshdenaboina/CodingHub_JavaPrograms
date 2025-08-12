public class ZomatoBill 
{
	public static void main(String args[]) 
	
	{
        	double discount = 0;
        	String restaurantName = "barbeque";
        	String customerName = "sai ganesh";
        	int Bill_number = 241;

        	String item1 = "Pizza";
        	int quantity1 = 2;
        	double price1 = 300;
        	double cost1 = price1 * quantity1;

        	String item2 = "Burger";
        	int quantity2 = 2;
        	double price2 = 150;
        	double cost2 = price2 * quantity2;

        	String item3 = "Fries";
        	int quantity3 = 2;
        	double price3 = 99;
        	double cost3 = price3 * quantity3;

        	double deliveryCharge = 50;

        	double totalPrice = cost1 + cost2 + cost3;
        	double gst = totalPrice * 0.18;
        	double totalCost = totalPrice + gst + deliveryCharge;

        	String paymentMethod = "gpay";

        	if (paymentMethod.equalsIgnoreCase("creditCard"))
		{
            		discount = 15;
        	} else if (paymentMethod.equalsIgnoreCase("debitCard")) 
		{
            		discount = 13;
        	} else if (paymentMethod.equalsIgnoreCase("phonePay")) 
		{
           		discount = 10;
        	} else if (paymentMethod.equalsIgnoreCase("gpay")) 
		{
            		discount = 8;
        	} else if (paymentMethod.equalsIgnoreCase("otherOnlineApps")) 
		{
            		discount = 5;
        	} else if (paymentMethod.equalsIgnoreCase("cash")) 
		{
            		discount = 2;
        	} else
		{
            		discount = 0;
        	}

        	double discountAmount = discount/100.0 * totalCost;
        	double finalAmount = totalCost  - discountAmount;

        
        	System.out.println("\n\tZOMATO BILL");
        	System.out.println("--------------------------------------------------");
        	System.out.println("Restaurant: " + restaurantName);
        	System.out.println("Customer: " + customerName);
        	System.out.println("Bill Number: " + Bill_number);
        	System.out.println("Payment Method: " + paymentMethod);
        	System.out.println("\n\tItems Ordered");
        	System.out.println("--------------------------------------------------");
        	System.out.println("ITEM NAME\tPRICE\tQUANTITY\tCOST\n");
        	System.out.println(item1 + "\t\t" + price1 + "\t   " + quantity1 + "\t\t" + cost1);
        	System.out.println(item2 + "\t\t" + price2 + "\t   " + quantity2 + "\t\t" + cost2);
        	System.out.println(item3 + "\t\t" + price3 + "\t   " + quantity3 + "\t\t" + cost3);
        	System.out.println("--------------------------------------------------");
        	System.out.println("\nTotal Price: " + totalPrice);
        	System.out.println("GST (18%): " + gst);
        	System.out.println("Delivery Charge: " + deliveryCharge);
        	System.out.println("Discount for " + paymentMethod + " (" + discount + "%): " + discountAmount);
        	System.out.println("--------------------------------------------------");
        	System.out.println("Final Amount: " + finalAmount);
        	System.out.println("--------------------------------------------------");
        	System.out.println("\n\tThank you for ordering in Zomato");
    	}
}
