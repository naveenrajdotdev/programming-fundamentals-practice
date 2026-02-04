import java.lang.*;
import java.util.*;

class lastdigiteven{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the last digit of number is even:");
        int number=getValue.nextInt();
        if((number%10)%2==0)
        {
        System.out.println("Last digit of given number is even");
        }
        else
        {
        System.out.println("Last digit of given number is not even");
        }
    }
}