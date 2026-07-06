package Arrays;
import java.util.*;

public class Array2 {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    int nums[]=new int[6];
    boolean isAsending = true;
    for(int i = 0; i<nums.length ;i++){
        nums[i]= sc.nextInt();
    }
    for(int i =0;i<nums.length-1; i++){
        if(nums[i]>nums[i+1]){
            isAsending=false;//condition for decending
            break;
        }
    }
    if(isAsending){
        System.out.println("Array is in asending order");
    }
    else{
         System.out.println("Array is not in asending order");
    }
    sc.close();
    }
}