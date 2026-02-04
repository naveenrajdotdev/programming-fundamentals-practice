import java.lang.*;
import java.util.*;

class RainfallCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter rainfall:");
        int rainfall=getValue.nextInt();
        if(rainfall>100)
        {
        System.out.println("Heavy rain");
        }
        else
        {
        System.out.println("Normal rain");
        }
    }
}