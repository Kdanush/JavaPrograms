package Functions;
import java.util.*;// printing average

public class Function5 {
    public static void averagePrinting(int num1, int num2 , int num3){
            int sum =num1+num2+num3;
            double res=sum/3;
            System.out.printf("%.2f" , res);
            return ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        averagePrinting(a,b,c);
        sc.close();
        return;//we can omit this since it is of void type doesnt return anything
    }
    
}
