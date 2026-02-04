import java.lang.*;
import java.util.*;

class leapyear{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter year:");
        int year=getValue.nextInt();
        if(year%4==0)
        {
        System.out.println("Given year is Leap year");
        }
        else
        {
        System.out.println("Given year is not Leap year");
        }
    }
}