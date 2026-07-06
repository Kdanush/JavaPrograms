package Patterns;//letter P
import java.util.*;

public class Pattern29{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if ( ( j==0) ||((j==4) && (i==1 || i==2)) || ((i==0 || i==3) && (j>0 && j<4)) )  {
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
