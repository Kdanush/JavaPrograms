package MathProblems;
import java.util.*;
//counting digits
public class Problems {
    public static int countDigits(int n){
        int count =0 , temp;
        temp =n;
        while(temp!=0){
            count++;
            temp= temp/10;
        }
        return count;
    }//optimal approach is using log with base 10 n +1; 
    
//re3versing integer without using string
public static int reverseNum(int num){
    int res = 0;
    while(num>0){
        res = res*10 +num%10;
        num=num/10;
    }
    return res;
}
public static boolean isPalindrome(int n){
    int temp =reverseNum(n);
    if(temp == n){
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(n));
   }
    
}
