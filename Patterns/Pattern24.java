package Patterns;//letter K
import java.util.*;

public class Pattern24{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if ( (j==0) || ( (i+j ==n/2 +1) && j>0) || (i-j == n/3) & j>1 )  {
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
