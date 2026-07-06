package Patterns;//letter I
import java.util.*;

public class Pattern22{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =5;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            // if ( ( i==0 || i== 6)|| ((j==2) &&(i!=0 && i!=6)))  {
            //   System.out.print("*");
            // }
            // else{
            //       System.out.print(" ");
            // }  

            if ( (j==2)|| ((i==0 || i==6) && j!=2) )  {
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
