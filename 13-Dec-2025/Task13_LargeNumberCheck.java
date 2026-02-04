import java.lang.*;
import java.util.*;

class LargeNumberCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter Number:");
        int number=getValue.nextInt();
        if(number>999)
        {
        System.out.println("Large number");
        }
        else
        {
        System.out.println("Small number");
        }
    }
}