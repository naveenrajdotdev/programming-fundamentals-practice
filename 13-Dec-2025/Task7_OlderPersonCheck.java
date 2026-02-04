import java.lang.*;
import java.util.*;

class OlderPersonCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first age:");
        int ageone=getValue.nextInt();
        System.out.println("Enter Second age:");
        int agetwo=getValue.nextInt();
        System.out.println((ageone>agetwo)?"“First is older":"Second is older");
    }
}