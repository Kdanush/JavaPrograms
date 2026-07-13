package Operators;
import java.util.*;

public class Operation2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        //using % finding even or odd

        // if(n%2 == 0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        //using bitwise operator

         if((n&1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        sc.close();
        
    }
    
}
