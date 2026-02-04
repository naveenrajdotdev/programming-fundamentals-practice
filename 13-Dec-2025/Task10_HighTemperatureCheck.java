import java.lang.*;
import java.util.*;

class HighTemperatureCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter temperature:");
        int temperature=getValue.nextInt();
        System.out.println((temperature>40)?"Very hot":"Normal");
    }
}