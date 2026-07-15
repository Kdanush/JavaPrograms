package Searching;
import java.util.Scanner;

public class BinarySearch {
    //using function;
    public static int BS(int a[], int target){ 
        int i = 0;
        int j = a.length-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(target<a[mid]){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        sc.close();
        int arrSample[]=new int[]{10,15,20,25,30,35,40 , 45, 50,55,60,65};
        // int i =0;
        // int j =arrSample.length-1;
        // while(i<=j){
        //     int mid =(i+j)/2;
        //     if(arrSample[mid]==tar){
        //         System.out.printf("element found at loc %d",mid);
        //         break;
        //     }
        //     else if(tar<arrSample[mid]){
        //         j=mid-1;
        //     }
        //     else{
        //         i=mid+1;
        //     }
        // }
        // if(i>j){
        //     System.out.println("Item not found");
        // }

        if(BS(arrSample,tar)==-1){
            System.out.println("Item not found");
        }
        else{
            System.out.printf("item found at index %d",BS(arrSample,tar));
        }
    }
}
