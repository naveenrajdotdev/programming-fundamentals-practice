import java.lang.*;
import java.util.*;

class lastdigitzero{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the last digit of number is zero:");
        int number=getValue.nextInt();
        if(number==0 || number%10==0)
        {
        System.out.println("Last digit of given number is 0");
        }
        else
        {
        System.out.println("Last digit of given number is not 0");
        }
    }
}