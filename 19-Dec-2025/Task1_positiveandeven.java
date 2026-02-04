import java.lang.*;
import java.util.*;

class positiveandeven{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter number");
int number=obj.nextInt();
if(number>0)
{
    if(number%2==0)
    {
    System.out.println("Given number is positive even.");
    }
    else
    {
        System.out.println("Given number is not positive even.");
    }
}
else
{
    System.out.println("Given number is negative or zero.");
}
}
}