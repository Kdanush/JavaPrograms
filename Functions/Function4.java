package Functions;
import java.util.*;// multiplication of table using function

public class Function4 {
    public static void tablePrinting(int num){
        for(int i =1 ; i<11;i++){
            System.out.printf("%d x %d = %d %n" , num ,i,(num*i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        tablePrinting(a);
        sc.close();
    }
    
}
