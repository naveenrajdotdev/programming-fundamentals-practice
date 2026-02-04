import java.lang.*;
import java.util.*;

class DrivingLicense{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter your age:");
int age=obj.nextInt();
if(age>=18)
{
    System.out.println("Result of your eye test (Pass/Fail)");
    String eyecheck=obj.next();
    if(eyecheck.equalsIgnoreCase("pass"))
    {
        System.out.println("license approved");
    }
    else
    {
        System.out.println("Eye test fail; license Rejected.");
    }
}
else
{
    System.out.println("Rejected due to age (Below 18).");
}
}
}