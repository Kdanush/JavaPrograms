import java.util.*;
public class Calculator{
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
char a = sc.next().charAt(0);
switch(a){
    case '+':
        System.out.println("Sum of numbers is " + (num1+num2));
        break;
    case '-':
        System.out.println("diff of numbers is " + (num1-num2));
        break;
    case '*':
        System.out.println("mul of numbers is " + (num1*num2));
        break;
    case '/':
        System.out.println("div of numbers is " + (num1/num2));
        break;
    case '%':
        System.out.println("modulous of numbers is " + (num1%num2));
        break;
    default:
        System.out.println("enter valid symbol");
}
sc.close();

    }
}