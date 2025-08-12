public class Product
{
public static void main(String[] args)
{
   String product_name ="pen";
   int product_price=2000;
   int product_quantity=5;
   double total_price=product_price*product_quantity;
   double discount=5.0/100*product_price;
   double total_cost=total_price-discount;
   double gst=18.0/100*total_cost;
   double final_bill=total_cost+gst;
   System.out.println("Product Name                :"+product_name);
   System.out.println("Product Price               :"+product_price);
   System.out.println("Product Quantity            :"+product_quantity);
   System.out.println("Total Price                 :"+total_price);
   System.out.println("Discount(5%)                :"+discount);
   System.out.println("After Discount Product Price:"+total_cost);
   System.out.println("gst(18%)                    :"+gst);
   System.out.println("Final Bill                  :"+final_bill);
}
}