package Patterns;//letter G
import java.util.*;

public class Pattern20{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int m =6;
        for(int i=0;i<n;i++){
         for(int j =0;j<m;j++){
            if( (j==0) || ((j==4)&& (i!=1 && i!=2 ))|| ((i==0 || i == 6) && (j>0 && j<4)) || ((i==3) &&(j==3 || j==5)))  {
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
