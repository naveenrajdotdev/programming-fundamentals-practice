import java.lang.*;
import java.util.*;

class DistanceComparison{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first distance:");
        int a=getValue.nextInt();
        System.out.println("Enter Second distance:");
        int b=getValue.nextInt();
        if(a>b)
        {
        System.out.println("Distance one is longer");
        }
        else
        {
        System.out.println("Distance two is longer");
        }
    }
}