import java.lang.*;
import java.util.*;

class FreezingCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter temperature:");
        int temperature=getValue.nextInt();
        if(temperature<0)
        {
        System.out.println("Water freezes");
        }
        else
        {
        System.out.println("Not frozen");
        }
    }
}