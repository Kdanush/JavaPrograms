package Sorting;

public class SelectionSort {
    public static void selectionSort(int []a){
        for(int i = 0; i<a.length-1;i++){
            int minn=a[i];
            int minIdx=i;
        for(int j =i+1;j<a.length;j++){
            if(a[j]<minn){
                minn=a[j];
                minIdx=j;
            }
        }
        if(minIdx!=i){
            int temp =a[i];
            a[i]=a[minIdx];
            a[minIdx]=temp;
        } 
    }
    }
    
    public static void main(String []args){
        int numArray[]=new int[]{44,16,18,10,22,15};

    //     for(int i = 0; i<numArray.length-1;i++){
    //         int minn=numArray[i];
    //         int minIdx=i;
    //     for(int j =i+1;j<numArray.length;j++){
    //         if(numArray[j]<minn){
    //             minn=numArray[j];
    //             minIdx=j;
    //         }
    //     }
    //     if(minIdx!=i){
    //         int temp =numArray[i];
    //         numArray[i]=numArray[minIdx];
    //         numArray[minIdx]=temp;
    //     } 
    // }
selectionSort(numArray);
System.out.println("Array is Sorted");  
for(int num :numArray){
    System.out.print(num+ " ");
}
}
}
