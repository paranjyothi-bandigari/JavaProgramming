package JavaProgramming.Imp22Java;

import java.util.HashSet;

public class firstRepeatingElementInArray {
    public static void main(String[] args) {
   int arr[]={2,3,4,3,5,2};
        int min=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<=arr.length-1;i++){
            if(set.contains(arr[i])) {
                break;
            }else{
                System.out.println(set);}
        }

    }
    }

