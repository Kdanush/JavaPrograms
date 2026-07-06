package Patterns;//letter V
import java.util.*;

public class Pattern35{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 4;
        int m =7;
        int row = 0 ;
        int clmn=6;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            // if ((i==j) || (i+j==6)) {
            //   System.out.print("*");
            // }
            if ((i==j)){
              System.out.print("*");
            }
            else if(i==row && j==clmn) {
            System.out.print("*");
            row+=1;
            clmn-=1;
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
