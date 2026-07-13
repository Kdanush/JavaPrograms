package Operators;
import java.util.*;

public class Operation1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
// swapping usin temp var
        // int temp = a;
        // a=b;
        // b=temp;

        //swapping using + , - operator
        // a=a+b;
        // b=a-b;
        // a=a-b;

        // using exor  operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("%d\t%d" , a ,b);
        sc.close();
    }
    
}
