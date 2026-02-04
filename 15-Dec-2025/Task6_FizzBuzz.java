import java.lang.*;
import java.util.*;

class FizzBuzz{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the number is FizzBuzz or NOT:");
        int number=getValue.nextInt();
        if(number%15==0)
        {
        System.out.println("FizzBuzz");
        }
        else
        {
        System.out.println("Not FizzBuzz");
        }
    }
}