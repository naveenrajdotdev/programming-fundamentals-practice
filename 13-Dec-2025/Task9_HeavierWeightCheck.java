import java.lang.*;
import java.util.*;

class HeavierWeightCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first Person's weight:");
        int weightOne=getValue.nextInt();
        System.out.println("Enter Second Person's weight:");
        int weightTwo=getValue.nextInt();
        System.out.println((weightOne>weightTwo)?"First is heavier":"Second is heavier");
    }
}