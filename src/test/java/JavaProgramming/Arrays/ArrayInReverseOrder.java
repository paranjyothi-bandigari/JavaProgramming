package JavaProgramming.Arrays;
//sorting
public class ArrayInReverseOrder {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1};
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+ " ");
        }
    }
}
