import java.lang.*;
import java.util.*;

class AttendanceWarning{
    public static void main(String args[]){
        Scanner getValue=new Scanner(System.in);

        System.out.println("Enter your attendance:");
        int attendance=getValue.nextInt();
        if(attendance<75)
        {
        System.out.println("Warning");
        }
        else
        {
        System.out.println("Allowed");
        }
    }
}