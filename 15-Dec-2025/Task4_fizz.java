import java.lang.*;
import java.util.*;

class fizz{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter any number to know that the number is FIZZ or NOT:");
        int number=getValue.nextInt();
        if(number%3==0)
        {
        System.out.println("Fizz");
        }
        else
        {
        System.out.println("Not Fizz");
        }
    }
}