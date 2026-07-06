import java.util.*;
public class Demo2 {
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if(age>18){
    System.out.println("You are eligible for voting");
}
else{
    System.out.println("not eligible");
}
sc.close();
    }

    
}
