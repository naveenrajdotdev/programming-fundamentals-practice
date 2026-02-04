import java.lang.*;
import java.util.*;

class BloodDonationWeightCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your weight for blood donation:");
        int weight=getValue.nextInt();
        if(weight<50)
        {
        System.out.println("Cannot donate");
        }
        else
        {
        System.out.println("Can donate");
        }
    }
}