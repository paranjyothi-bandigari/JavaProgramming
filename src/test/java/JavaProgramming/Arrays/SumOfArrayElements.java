package JavaProgramming.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
