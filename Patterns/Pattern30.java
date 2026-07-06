package Patterns;//letter Q
import java.util.*;

public class Pattern30{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 8;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if (((j==0 || j==4) && (i>0 && i<6)) || ((i==0 || i==6) && (j>0 &&j<4)) || (i==5 && j==1) || (i==7 && j==3))  {
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
