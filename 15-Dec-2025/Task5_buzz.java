import java.lang.*;
import java.util.*;

class Buzz{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the number is BUZZ or NOT:");
        int number=getValue.nextInt();
        if(number%5==0)
        {
        System.out.println("Buzz");
        }
        else
        {
        System.out.println("Not Buzz");
        }
    }
}