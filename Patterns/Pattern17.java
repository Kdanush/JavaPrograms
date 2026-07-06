package Patterns;//letter D
import java.util.*;

public class Pattern17{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if( (j==0) || ((j==m-1)&& (i!=0 && i!=n-1 )) || ((i==0 || i==n-1) && (j>0 && j<m-1))){
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
