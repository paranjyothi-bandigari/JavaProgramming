package JavaProgramming.Lists;

import java.util.Arrays;
import java.util.List;

public class revList {
    public static void main(String[] args) {

        List<Integer> intList1 = Arrays.asList(11, 32, 35, 41, 59, 65, 77, 89);
        for(int i=intList1.size()-1;i>=0;i--){
            System.out.println(intList1.get(i));
        }
    }
}
