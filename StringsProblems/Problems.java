package StringsProblems;
import java.util.*;
public class Problems {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(s);

        //concatination
        String firstName ,secondName ;
        firstName=sc.nextLine();
        secondName=sc.nextLine();
        var fullName = firstName+secondName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i) + " ");
        }        
        
        
        
        sc.close();

    }
    
}
