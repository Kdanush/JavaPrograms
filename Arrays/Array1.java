package Arrays;// searching for an element in array // using linear search
import java.util.*;


public class Array1 {
    public static void main(String [] args){
        int values[] = new int[8];
        Scanner sc = new Scanner(System.in);
        for( int i =0; i<values.length; i++){
            values[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0 ; i< values.length;i++){
            if (values[i]==target){
                System.out.printf("The target is found at %d" , i);
             break;   
            }
        }
        sc.close();

    }
    
}
