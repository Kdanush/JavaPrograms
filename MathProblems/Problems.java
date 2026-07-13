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

public static int gcdOfTwoNumMethod(int a , int b){//using brute force
    int gcd = 1;
    for(int i =1; i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd =i;
            }
        }
    return gcd;
}

public static int fingGCD(int a , int b){//using brute force better approach
    for(int i =Math.min(a,b); i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
    return 1;
}

public static int gcdEcludien(int a , int b){//optimal appraoch

    while(a>0 && b >0){
        if(a>b){
            a=a%b;
        }
        else{
            b=b%a;
        }
    }
    if(a==0){
        return b;
    }
    return a;
}
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println(gcdEcludien(n,n2));
   }
    
}
