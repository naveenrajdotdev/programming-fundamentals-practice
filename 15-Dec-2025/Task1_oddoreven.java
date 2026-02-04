import java.lang.*;
import java.util.*;

class oddoreven{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number:");
        int number=getValue.nextInt();
        if(number%2==0)
        {
        System.out.println("Given number is EVEN");
        }
        else
        {
        System.out.println("Given number is ODD");
        }
    }
}