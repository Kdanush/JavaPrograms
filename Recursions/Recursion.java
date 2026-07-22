package Recursions;
import java.util.Scanner;

public class Recursion{
    public static void function1(int i,int n){
        if(i>n){
            return;
        }
        System.out.print("Danush" + "  ");
        function1(i+1,n);
        
    }

public static void function2(int i,int n){
    if(i>n){
        return;
    }

    System.out.printf("%d ",i);
    function2(i+1,n);
}

public static void function3(int i,int n){
    if(i<1){
        return;
    }
    System.out.printf("%d ",i);
    function3(i-1,n);
}

public static void function4(int i, int n){
    if(i<1){
        return;
    }
    function4(i-1,n);
    System.out.printf("%d\t",i);

} 

public static void function5(int i, int n){


    if(i>n){
        return;
    }
    function5(i+1,n);
    System.out.printf("%d\t",i);
}

public static void function6(int i,int sum){//using perimeterised recursion
        // sum of n numbers
    if(i<1){
        System.out.printf("%d",sum);
        return;
    }
    function6(i-1,sum+i);
}

public static int function7(int n){
    if(n<1){  // sum of numbers n using functional recursion
        return 0;
    }
    return n+function7(n-1);
}

public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("%d",function7(num));
        sc.close();


    }

}