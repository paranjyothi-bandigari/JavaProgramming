package JavaProgramming.Imp22Java;

import java.util.HashSet;

public class firstRepeatingElementInArray {
    public static void main(String[] args) {
   int arr[]={2,3,4,3,5,2};

        for(int i=0;i<=arr.length-1;i++) {
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First Repeated element in array is : "+arr[i]);
                    // break;
                }

            }break;
        }

    }
    }

