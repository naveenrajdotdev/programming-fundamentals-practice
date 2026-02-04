import java.lang.*;
import java.util.*;

class collegeadmission{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("What is your mark?");
int mark=obj.next();
if(mark>=70)
{
    System.out.println("You are selected.");
    System.out.println("You have 10th and 12th Marksheet? (Yes/No)");
    String marksheet=obj.next();
    if(marksheet.equalsIgnoreCase("Yes"))
    {
        System.out.println("Documents Verified. Admission confirmed");
    }
    else
    {
        System.out.println("You Must have 10th and 12th marksheet");
    }
}
else
{
    System.out.println("admission rejected");
}
}
}