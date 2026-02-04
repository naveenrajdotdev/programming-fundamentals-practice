import java.lang.*;
import java.util.*;
class age{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=getValue.nextInt();
        if(age<13 && age>0)
        {
            System.out.println("Child");
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("Teenager");
        }
        else if(age>=20 && age<=59)
        {
            System.out.println("Adult");
        }
        else if(age>=60)
        {
            System.out.println("Senior Citizen");
        }
    }
}