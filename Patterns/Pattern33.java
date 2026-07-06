package Patterns;//letter T
import java.util.*;

public class Pattern33{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            // if ((i==0) || (j==2 && i>0)) {
            //   System.out.print("*");
            // }
            if ((j==2) || (i==0 && j!=2)) {
              System.out.print("*");
            }
            else{
                  System.out.print(" ");
            }  
         }
        System.out.println();
        }
        sc.close();
    }   
}
