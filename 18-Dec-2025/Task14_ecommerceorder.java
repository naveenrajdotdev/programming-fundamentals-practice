import java.lang.*;
import java.util.*;

class ecommerceorder{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Product in stock? (Yes/No)");
String stock=obj.next();
if(stock.equalsIgnoreCase("Yes"))
{
    System.out.println("Payment received? (Yes/No)");
    String Payment=obj.next();
    if(Payment.equalsIgnoreCase("Yes"))
    {
        System.out.println("Order confirmed.");
    }
    else
    {
        System.out.println("Payment pending. Order not confirmed.");
    }
}
else
{
    System.out.println("Product out of stock.");
}
}
}