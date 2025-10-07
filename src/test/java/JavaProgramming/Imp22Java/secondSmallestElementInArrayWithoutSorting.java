package JavaProgramming.Imp22Java;

import java.util.Arrays;

public class secondSmallestElementInArrayWithoutSorting {
    public static void main(String[] args) {
        int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        int smallest=arr[0];
        int secondSmallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
