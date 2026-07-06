import java.util.*;

public class Demo3 {
    //understanding about switch  
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    switch(button){
        case 1:System.out.println("Hello");
        break;
        case 2: System.out.println("Hi");
                System.out.println("How are you?");
        break;
        default :
            System.out.println("You are ");
    }

    sc.close();
    }
    
}
