package Patterns;//letter K
import java.util.*;

public class Pattern26{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =7;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if (( j==0 || j==6) || ((i==j) && (j>0 && j<4)) || (i==1 && j==5) || (i==2 && j==4) ) {
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
