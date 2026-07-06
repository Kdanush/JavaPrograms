package Functions;// 
import java.util.*;

public class Function8 {
    public static void voteElegibleChecker(int num1){

        if(num1>18 ){
            System.out.println("eligeble for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
        }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        voteElegibleChecker(n);
        sc.close();
    }
}
