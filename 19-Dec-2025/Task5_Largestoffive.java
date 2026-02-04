import java.lang.*;
import java.util.*;

class Largestofthree{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter first number:");
int a=obj.nextInt();
System.out.println("Enter second number:");
int b=obj.nextInt();
System.out.println("Enter third number:");
int c=obj.nextInt();
if(a!=b || b!=c || c!=a)
{
    if(a>b && a>c)
    {
    System.out.println("A is greater");
    }
    else if(b>a && b>c)
    {
        System.out.println("B is greater");
    }
    else
    {
        System.out.println("C is greater");
    }
}
else
{
    System.out.println("All are same.");
}
}
}