import java.lang.*;
import java.util.*;

class HighestScore{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first score:");
        int a=getValue.nextInt();
        System.out.println("Enter Second score:");
        int b=getValue.nextInt();
        if(a>b)
        {
        System.out.println("First is higher");
        }
        else
        {
        System.out.println("Second is higher");
        }
    }
}