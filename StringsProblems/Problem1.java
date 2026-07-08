package StringsProblems;//reversing a string
import java.util.*;

public class Problem1 {
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.nextLine());
    for(int i =0; i<s.length()/2;i++){
        int front = i;
        int back = s.length()-1-i;

        char frontChar = s.charAt(front);
        char backChar = s.charAt(back);

        s.setCharAt(front,backChar);
        s.setCharAt(back,frontChar);
    } 
    System.out.println(s);
    sc.close();
    }   
}
