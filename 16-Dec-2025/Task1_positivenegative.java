import java.lang.*;
import java.util.*;

class positivenegative{
    public static void main(String args[])
    {
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter number:");
	int number=getValue.nextInt();        
	if(number>0)
        {
            System.out.println("Positive Number");
        }
        else if(number<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}