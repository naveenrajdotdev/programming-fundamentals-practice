import java.lang.*;
import java.util.*;
class divisiblebyfiveeleven{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=getValue.nextInt();
        System.out.println("Enter second number:");
        int b=getValue.nextInt();
        System.out.println("Enter third number:");
        int c=getValue.nextInt();
        if(a==b && a==c)
        {
            System.out.println("All are equal");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("Two numbers are equal");
        }
        else if(a!=b && b!=c && c!=a)
        {
            System.out.println("All are different");
        }
    }
}