import java.lang.*;
import java.util.*;

class HighSalaryCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary=getValue.nextInt();
        if(salary>50000)
        {
        System.out.println("High salary");
        }
        else
        {
        System.out.println("Normal salary");
        }
    }
}