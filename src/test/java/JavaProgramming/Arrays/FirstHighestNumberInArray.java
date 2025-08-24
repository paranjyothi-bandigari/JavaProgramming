package JavaProgramming.Arrays;

import java.util.Arrays;
//1st Highest number in an array
public class FirstHighestNumberInArray {
    public static void main(String[] args) {
        int[] num ={5,4,7,8,9,2,1}; //1 2 4 5 7 8 9
        Arrays.sort(num);

        System.out.println(num[num.length-1]);
    }
}
