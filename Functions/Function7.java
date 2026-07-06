package Functions;// printing sum of odd numbers from 1 to n 
import java.util.*;

public class Function7 {
    public static int greaterValue(int num1,int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
        }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%d is the greatest number %n" ,greaterValue(n,m));
        sc.close();
    }
}
