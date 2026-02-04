import java.lang.*;
import java.util.*;
class divisiblebyfiveeleven{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number=getValue.nextInt();
        if(number%5==0 && number%11==0)
        {
            System.out.println("Divisible by both");
        }
        else if(number%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else if(number%11==0)
        {
            System.out.println("Divisible by 11");
        }
        else if(number%5!=0 && number%11!=0)
        {
            System.out.println("Not divisible by 5 or 11");
        }
    }
}