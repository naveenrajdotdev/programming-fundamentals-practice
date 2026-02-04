import java.lang.*;
import java.util.*;

class numbercheck{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner getValue=new Scanner(System.in);
        int number=getValue.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Type number only 1 to 5.");
        }
    }
}