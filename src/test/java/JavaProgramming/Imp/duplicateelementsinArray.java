package JavaProgramming.Imp;
import java.util.Set;
import java.util.HashSet;


public class duplicateelementsinArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9,1};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                System.out.println("Duplicate element found: " + array[i]);
            } else {
                set.add(array[i]);
            }
        }
    }

}
