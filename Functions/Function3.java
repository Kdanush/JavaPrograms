package Functions;
import java.util.*;

public class Function3 {
    public static boolean isEven(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.printf("%d is Even",a);
        }
        else{
            System.out.printf("%d is odd",a);
        }
        sc.close();
    }
    
}
