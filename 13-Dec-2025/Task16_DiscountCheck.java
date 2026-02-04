import java.lang.*;
import java.util.*;

class DiscountCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter Discount:");
        int discount=getValue.nextInt();
        if(discount>20)
        {
        System.out.println("Big discount");
        }
        else
        {
        System.out.println("Normal discount");
        }
    }
}