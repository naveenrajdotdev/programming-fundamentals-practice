import java.lang.*;
import java.util.*;

class LoginAuthentication{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter username:");
String uname=obj.next();
System.out.println("Enter password:");
String password=obj.next();
if(uname.equals("Admin"))
{
    if(password.equals("12345"))
    {
        System.out.println("login success");
    }
    else
    {
        System.out.println("Wrong Password");
    }
}
else
{
    System.out.println("Invalid user");
}
}
}