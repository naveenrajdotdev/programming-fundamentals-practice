import java.lang.*;
import java.util.*;

class HighPercentageCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter percentage:");
        int percentage=getValue.nextInt();
        if(percentage>90)
        {
        System.out.println("Excellent");
        }
        else
        {
        System.out.println("Good");
        }
    }
}