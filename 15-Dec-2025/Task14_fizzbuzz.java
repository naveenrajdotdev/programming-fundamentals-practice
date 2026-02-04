import java.lang.*;
import java.util.*;

class fizzbuzz{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number:");
        int number=getValue.nextInt();
        if(number%3==0)
        {
        System.out.println("Fizz");
        }
        else
        {
        System.out.println("Buzz");
        }
    }
}