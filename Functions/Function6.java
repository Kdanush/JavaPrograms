package Functions;// printing sum of odd numbers from 1 to n 
import java.util.*;

public class Function6 {
    public static int sumOffOddNum(int num){
        int res = 0;
        for(int i=1;i<num+1;i++){
            if(i%2!=0){
                res+=i;
            }
        }
    return res;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int result =sumOffOddNum(n);
        System.out.printf("Sum Off Odd numbers is in between n numbers is %d" ,result);
        sc.close();
    }
}
