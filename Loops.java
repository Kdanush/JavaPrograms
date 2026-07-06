import java.util.*;


public class Loops {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int num=sc.nextInt();
        for(int i=1;i<num+1;i++){
            sum=sum+i;

        }
        System.out.println(sum);
        sc.close();
    }
    
}
