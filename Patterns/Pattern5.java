package Patterns;

import java.util.*;

public class Pattern5 {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // for (int i =0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //         }
        //     for(int j =0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     }

        for (int i =0;i<n;i++){
            System.out.println(" ".repeat(n-i-1) + "*".repeat(i+1)); // more efficient way...
            }
        
    sc.close();
    }
    
}
