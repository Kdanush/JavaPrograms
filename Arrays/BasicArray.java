package Arrays;

import java.util.*;
public class BasicArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // boolean [] marks = new boolean[5];
        // System.out.println();
        int marks [] = new int[]{90 , 99 , 95};
        // int marks[] = {90,99,95};
        //int marks[] = new int[3];
        // System.out.println(marks);
        //input 
        for(int i = 0; i<3;i++){
            marks[i]= sc.nextInt();
        }
        for( int i = 0 ; i<3;i++){
            System.out.print( marks[i] + " ");
        }
        sc.close();
    }
}