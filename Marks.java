import java.util.*;

class Marks{
    public static void main(String []args){
        int input=0 ;
        Scanner sc=new Scanner(System.in);

        do{
            int marks = sc.nextInt();

            if (marks>=90 && marks<=100){
                System.out.println("This is good");
            }
            else if(marks >=60 && marks <=89){
                System.out.println("this is very good");
            }
            else if(marks>=0 && marks <=59){
                System.out.println("This also good");
            
            input = sc.nextInt();
            }
        }while(input==1);
        System.out.println("marks doent matter your efforts does");
        sc.close();
    }
   
}