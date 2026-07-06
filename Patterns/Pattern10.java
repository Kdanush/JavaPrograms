package Patterns;
import java.util.*;// butterfly pattern

public class Pattern10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<i+1;j++){
    //            System.out.print("*");
    //         }
    //         for(int j=0;j<2*(n-1-i);j++){
    //            System.out.print(" ");
    //         }
    //         for(int j=0;j<i+1;j++){
    //            System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        

    //     for(int i=n-1;i>-1;i--){
    //         for(int j=0;j<i+1;j++){
    //            System.out.print("*");
    //         }
    //         for(int j=0;j<2*(n-1-i);j++){
    //            System.out.print(" ");
    //         }
    //         for(int j=0;j<i+1;j++){
    //            System.out.print("*");
    //         }
    //         System.out.println();
    // }

    for(int i=0; i<n;i++){
        System.out.print("*".repeat(i+1) + " ".repeat(2*(n-1-i)) + "*".repeat(i+1));
        
    System.out.println();

    }
    for(int i=n-2; i>-1;i--){
        System.out.print("*".repeat(i+1) + " ".repeat(2*(n-1-i)) + "*".repeat(i+1));
        
    System.out.println();
    }
    sc.close();
}
}


    
