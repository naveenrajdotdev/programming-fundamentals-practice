import java.lang.*;
import java.util.*;
class passorfain{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark=getValue.nextInt();
        if(mark>=90 && mark<=100)
        {
            System.out.println("Grade A");
        }
        else if(mark<=89 && mark>=75)
        {
            System.out.println("Grade B");
        }
        else if(mark>=60 && mark<=75)
        {
            System.out.println("Grade C");
        }
        else if(mark>=0 && mark<=59)
        {
            System.out.println("Fail");
        }
    }
}