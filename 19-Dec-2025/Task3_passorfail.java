import java.lang.*;
import java.util.*;

class passorfail{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter your mark:");
int mark=obj.nextInt();
if(mark>=0 && mark<=100)
{
    if(mark>=35)
    {
    System.out.println("Pass");
    }
    else
    {
        System.out.println("Fail");
    }
}
else
{
    System.out.println("Enter valid mark (0-100 only)");
}
}
}