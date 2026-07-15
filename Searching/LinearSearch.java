package Searching;
import java.util.Scanner;

public class LinearSearch {
    //creating a method
public static int linearSearch(int []a,int tar){
    int flag =0;
    int loc =-1;
    for(int i =0;i<a.length;i++){
        if(a[i]==tar){
            flag =1;
            loc=i;
            break;
        }
        }
        return loc; 
    }
 
 
 //using recursion 


    public static void main(String []args){
    int [] numArry= new int[]{10,12,14,15,16,18};
    Scanner sc = new Scanner(System.in);
    int ITEM= sc.nextInt();
    sc.close();
    // int flag =0,loc=-1;
    // for(int i =0;i<numArry.length;i++){
    //     if(numArry[i] == ITEM){
    //         flag =1;
    //         loc=i;
    //         break;
    //     }
    // }
    int res =linearSearch(numArry,ITEM);
    if( res == -1){
        System.out.print("Item Not Found");
    }
    else{
        System.out.printf("Item found at location %d",res);
    }
 }   
}
