import java.lang.*;
import java.util.*;

class PassFailCheck{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your Mark:");
        int mark=getValue.nextInt();
        System.out.println((mark>34)?"Passed":"Failed");
    }
}