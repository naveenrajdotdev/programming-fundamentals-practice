import java.lang.*;
import java.util.*;

class SmallerNumber{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter first Value:");
        int a=getValue.nextInt();
        System.out.println("Enter Second Value:");
        int b=getValue.nextInt();
        System.out.println((a<b)?"First is smaller":"Second is smaller");
    }
}