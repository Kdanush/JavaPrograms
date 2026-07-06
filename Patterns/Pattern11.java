package Patterns;
import java.util.*;

public class Pattern11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<n;i++){
            System.out.print(" ".repeat(n-1-i) + "*".repeat(n));
            System.out.println();
        }
        
        sc.close();

    }
    
}