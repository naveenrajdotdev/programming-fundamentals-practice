import java.lang.*;
import java.util.*;

class VotingEligibility{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age=getValue.nextInt();
        System.out.println((age>17)?"Eligible":"Not eligible");
    }
}