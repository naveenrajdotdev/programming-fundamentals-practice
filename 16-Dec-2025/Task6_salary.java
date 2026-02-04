import java.lang.*;
import java.util.*;
class salary{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary=getValue.nextInt();
        if(salary>=50000)
        {
            System.out.println("High Income");
        }
        else if(salary>=30000 && salary<=49999)
        {
            System.out.println("Medium Income");
        }
        else if(salary<30000)
        {
            System.out.println("Low Income");
        }
    }
}