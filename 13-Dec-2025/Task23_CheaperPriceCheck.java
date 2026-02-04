import java.lang.*;
import java.util.*;

class CheaperPriceCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first price:");
        int a=getValue.nextInt();
        System.out.println("Enter Second price:");
        int b=getValue.nextInt();
        if(a<b)
        {
        System.out.println("Price one is cheaper");
        }
        else
        {
        System.out.println("Price two is cheaper");
        }
    }
}