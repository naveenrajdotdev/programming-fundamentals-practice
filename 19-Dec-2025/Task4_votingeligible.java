import java.lang.*;
import java.util.*;

class votingeligible{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter your age:");
int age=obj.nextInt();
if(age>0)
{
    if(age>=18)
    {
    System.out.println("Eligible");
    }
    else
    {
        System.out.println("Not eligible");
    }
}
else
{
    System.out.println("Enter valid age.");
}
}
}