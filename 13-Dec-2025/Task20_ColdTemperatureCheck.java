import java.lang.*;
import java.util.*;

class ColdTemperatureCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter temperature:");
        int temperature=getValue.nextInt();
        if(temperature<15)
        {
        System.out.println("Cold");
        }
        else
        {
        System.out.println("Warm");
        }
    }
}