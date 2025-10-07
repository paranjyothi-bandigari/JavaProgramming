package JavaProgramming.Imp22Java;
import java.util.Arrays;

public class secondlargestinArray {
    public static void main(String[] args) {
        int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length-2]);



    }
}