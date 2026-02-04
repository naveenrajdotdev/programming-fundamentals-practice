import java.lang.*;
import java.util.*;
class temperature{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter temperature:");
        int temperature=getValue.nextInt();
        if(temperature>40)
        {
            System.out.println("Very hot");
        }
        else if(temperature>=30 && temperature<=40)
        {
            System.out.println("Medium Income");
        }
        else if(temperature<30000)
        {
            System.out.println("Low Income");
        }
    }
}