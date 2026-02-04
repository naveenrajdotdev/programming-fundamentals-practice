import java.lang.*;
import java.util.*;

class positiveandeven{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter first number:");
int firstnumber=obj.nextInt();
System.out.println("Enter second number:");
int secondnumber=obj.nextInt();
if(firstnumber!=secondnumber)
{
    if(firstnumber>secondnumber)
    {
    System.out.println("First number is larger.");
    }
    else
    {
        System.out.println("Second number is larger.");
    }
}
else
{
    System.out.println("Both numbers are equal.");
}
}
}