package Patterns;//letter A
import java.util.*;

public class Pattern14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if(((j==0 || j==m-1 ) && i!=0) || ((i==0 ||i==3) &&(j>0 && j<m-1)) ){
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
