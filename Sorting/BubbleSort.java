package Sorting;

public class BubbleSort {
    public static void bubbleSort(int a[]){
        for(int i = 0; i<a.length-1;i++){
            boolean swapped = false;// for more otimisation fing sorted array in advance
            for(int j =0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    //using temp 
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break; // if not even single  swapping is done in any pass then after that pass this wiilexecute and breaks the loop  
            }
        }
        return  ;
    }
    
    public static void main(String [] argas){
        int [] arrayNum=new int[]{33,11,44,36,54,22,39,28};
        // boolean swapped;
        // for(int i = 0; i<arrayNum.length-1;i++){
        //     boolean swapped = false;// for more otimisation fing sorted array in advance
        //     for(int j =0;j<arrayNum.length-1-i;j++){
        //         if(arrayNum[j] > arrayNum[j+1]){
        //             //using temp 
        //             int temp = arrayNum[j];
        //             arrayNum[j]=arrayNum[j+1];
        //             arrayNum[j+1]=temp;
        //             swapped = true;

                    //using exor
                    
                    // arrayNum[j]=arrayNum[j]^arrayNum[j+1];
                    // arrayNum[j+i]=arrayNum[j]^arrayNum[j+1];
                    // arrayNum[j]=arrayNum[j]^arrayNum[j+1];
                    //swapped =true;
        //         }
        //     }
        //     if(!swapped){
        //         break; // if not even single  swapping is done in any pass then after that pass this wiilexecute and breaks the loop  
        //     }
        // }
        bubbleSort(arrayNum);
        System.out.println("array is sorted ");
       for(int num :arrayNum){
        System.out.print(num + "  ");
       }
    }
}
