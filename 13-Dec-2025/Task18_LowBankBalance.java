import java.lang.*;
import java.util.*;

class LowBankBalance{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your bank balance amount:");
        int balance=getValue.nextInt();
        if(balance<1000)
        {
        System.out.println("Low balance");
        }
        else
        {
        System.out.println("Balance OK");
        }
    }
}