package JavaProgramming.Arrays;

import java.util.Arrays;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] num={1,3,7,9,6,8}; // 1 3 6 7 8 9
        Arrays.sort(num);
        System.out.println(num[num.length-2]);


    }

}
