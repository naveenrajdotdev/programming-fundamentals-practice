import java.lang.*;
import java.util.*;

class divisiblebythree{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number:");
        int number=getValue.nextInt();
        if(number%3==0)
        {
        System.out.println("Given number is divisible by 3.");
        }
        else
        {
        System.out.println("Given number is not divisible by 3.");
        }
    }
}