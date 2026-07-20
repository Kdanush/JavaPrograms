package  Sorting;

public class InsertionSort{

    public static int[] insertionSort(int []a){
        for(int i =1;i<a.length;i++){// using moving each elemnt by one step to right and inserting the elem in crct pos
            int newTemp =a[i]; 
            int j=i-1;
            while(j>=0 && a[j]>newTemp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=newTemp;
        }
        return a;

    }

    public static void main(String[] args ){
        int [] numArray = new int[]{14,9,15,12,6,8,13};
        // for(int i =1;i<numArray.length;i++){// using moving each elemnt by one step to right and inserting the elem in crct pos
        //     int newTemp =numArray[i]; 
        //     int j=i-1;
        //     while(j>=0 && numArray[j]>newTemp){
        //         numArray[j+1]=numArray[j];
        //         j--;
        //     }
        //     numArray[j+1]=newTemp;
        // }
        // for(int i =1;i<numArray.length;i++){// using swapping 
        //     int j=i;
        //     while(j>0 && numArray[j-1]>numArray[j]){
        //         int temp = numArray[j-1];
        //         numArray[j-1]=numArray[j];
        //         numArray[j]=temp;
        //         j--;
        //     }
        // }

    insertionSort(numArray);
    for(int num : numArray){
        System.out.printf("%d",num);
    }
    }
}
