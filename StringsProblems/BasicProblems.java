package StringsProblems;
import java.util.*;

public class BasicProblems {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() ,totLength=0;
        String s[] = new String[size];
        for(int i=0;i<size;i++){
            s[i]=sc.next();//if we take nextline it will leave \n in input buffer
            totLength+=s[i].length();
        }
        System.out.println(totLength);

        sc.close();
    }
    
}
