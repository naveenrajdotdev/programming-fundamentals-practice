import java.lang.*;
import java.util.*;

class CompoundIntrest{
    public static void main(String args[]){
    int P= 1000;
    int R= 10;
    int T= 2;
    int A=P*(1+R/100)*(1+R/100);
    int CI=A-P;
    System.out.println("Compound Intrest: " + CI);
}
}