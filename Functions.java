import java.util.*;

public class Functions {
    // public static void printMyName(String name){
    //     System.out.println(name);
    // }

    // public static int Sum(int a , int b){
    //     return a+b;
    // }

    public static int calculateProduct(int a , int b){
        int product = a*b;
        return product;
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        else{
            for(int i=2;i<num;i++) {
                if(i%2==0){
                    return false;
                }
            }
        } 
        return true;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        // String name =sc.next();
        // printMyName(name);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c=Sum(a,b);
        // System.out.println(c);
        // int product =calculateProduct(a,b);
        // System.out.println(product);

        int a = sc.nextInt();
        if (isPrime(a)) {
            System.out.println("number is  prime");
        }
        else{
            System.out.println("number is not prime");
        }
        sc.close();
        }
}