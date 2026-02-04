import java.lang.*;
import java.util.*;

class divisiblebytwoandthree{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the number divisible by both 2 and 3:");
        int number=getValue.nextInt();
        if(number%2==0 && number%3==0)
        {
        System.out.println("Given number is divisible by both 2 and 3.");
        }
        else
        {
        System.out.println("Given number is not divisible by both 2 and 3");
        }
    }
}