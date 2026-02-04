import java.lang.*;
import java.util.*;

class SpeedLimitCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your speed:");
        int speed=getValue.nextInt();
        if(speed>60)
        {
        System.out.println("Over speed");
        }
        else
        {
        System.out.println("Safe speed");
        }
    }
}