package JavaProgramming.Arrays;

import java.util.Arrays;
//assending order od array
public class AssendingOrderOfArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
    Arrays.sort(numbers);
    for(int i=0; i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");

    }
    }
}
