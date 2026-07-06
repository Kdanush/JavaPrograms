package Patterns;//letter J
import java.util.*;

public class Pattern23{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if ( (j==2) || ((i==0) && j!=2) || ((i==6) && j<2))  {
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
