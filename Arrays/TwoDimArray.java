package Arrays;
import java.util.*;

public class TwoDimArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int clmns= sc.nextInt();
        int array[][]=new int[rows][clmns];
        //input from user for 2D Array
        for(int i=0;i<rows;i++){
            for(int j =0;j<clmns;j++){
                array[i][j]=sc.nextInt();
            }
        }
        //printing elemets in 2d array
        for(int i =0; i<rows;i++){
            for(int j=0;j<clmns;j++){
                System.out.printf("%d\t" , array[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
