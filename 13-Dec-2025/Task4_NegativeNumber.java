import java.lang.*;
import java.util.*;

class NegativeNumber{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter Value:");
        int a=getValue.nextInt();
        System.out.println((a<0)?"Negative":"Positive or Zero");
    }
}