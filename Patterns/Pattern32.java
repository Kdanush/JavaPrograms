package Patterns;//letter S
import java.util.*;

public class Pattern32{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            // if (((i==0 || i==3 || i==6)&&(j>0 && j<4)) || ((j==0) && (i==1 || i==2))|| ((j==4) &&(i==4 || i==5)))  {
            //   System.out.print("*");
            // }
            if (((i==0 || i==3 || i==6)&&(j>0 && j<4)) || ((j==0) && (i>0 && i<3))|| ((j==4) &&(i>3 && i<6))) {
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
