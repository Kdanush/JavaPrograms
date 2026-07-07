package Arrays;
import java.util.*;

public class Array3{
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    int nums[]=new int[10];
    int sum =0;
    for(int i = 0; i<nums.length ;i++){
        nums[i]= sc.nextInt();
    }
    for(int i =0;i<nums.length; i++){
        sum+=nums[i];
        }
    System.out.println(sum);
    System.out.println(sum/nums.length);
    sc.close();
    }
}