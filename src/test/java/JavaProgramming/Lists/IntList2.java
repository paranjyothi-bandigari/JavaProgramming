package JavaProgramming.Lists;

import java.util.Arrays;
import java.util.List;

public class IntList2 {
    public static void main(String[] args) {

      List<Integer> intList2= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        boolean found=false;
        for(Integer num:intList2){
            if(num>2 && num%2==0){
                System.out.println(num +" Is greater than 2 and even");
                found=true;
            }
        }
        if(!found){
            System.out.println("Number is not either equal to 2 or odd");
        }

    }
}
