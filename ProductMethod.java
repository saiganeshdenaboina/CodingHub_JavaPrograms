class Main 
{
	public static void main(String[] args) 
	{
        	Product p1 = new Product();
        	p1.code = 783;
        	p1.quantity = 5;
        	p1.name = "soap";
        	p1.price = 2000;
        
        	double total = p1.total();
        	double discount = p1.discounts(total);
        	System.out.println("Final Amount: " + p1.finalAmount(p1.price, discount));
    	}
}

class Product 
{
    	int code, quantity;
    	String name;
    	double price;

    	double total() 
	{
        	return quantity * price;
    	}

    	double discounts(double total) 
	{
        	double discount = 0;
        	if (total >= 1500 && total <= 2000)
            		discount = 10 * price / 100.0;
        	else if (total >= 900 && total <= 1500)
            		discount = 6 * price / 100.0;
        	else
            		discount = 2 * price / 100.0;
        	return discount;
    	}

    	double finalAmount(double price, double discount) 
	{
        	return price - discount;
   	}
}
