import java.lang.*;
import java.util.*;

class lastdigitfive{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter number:");
        int number=getValue.nextInt();
        if((number%10)==5)
        {
        System.out.println("Last digit of given number is five");
        }
        else
        {
        System.out.println("Last digit of given number is not five");
        }
    }
}