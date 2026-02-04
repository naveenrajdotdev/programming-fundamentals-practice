import java.lang.*;
import java.util.*;

class TallerPersonCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first Person's height:");
        int heightOne=getValue.nextInt();
        System.out.println("Enter Second Person's height:");
        int heightTwo=getValue.nextInt();
        System.out.println((heightOne>heightTwo)?"“First is taller":"Second is taller");
    }
}