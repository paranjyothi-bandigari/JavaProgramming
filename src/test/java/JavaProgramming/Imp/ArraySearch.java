package JavaProgramming.Imp;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int index = Arrays.binarySearch(array, key);
        System.out.println(index);

    }
}
