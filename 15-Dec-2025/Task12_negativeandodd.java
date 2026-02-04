import java.lang.*;
import java.util.*;

class negativeodd{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter number:");
        int number=getValue.nextInt();
        if(number<0)
        {
            if(number%2!=0)
            {
                System.out.println("Given number is negative odd number.");
            }
            else
            {
                System.out.println("Given number is negative number Not odd number.");
            }
        }
        else
        {
        System.out.println("Given number is not negative odd number.");
        }
    }
}