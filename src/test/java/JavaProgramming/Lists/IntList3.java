package JavaProgramming.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class IntList3 {
    public static void main(String[] args) {
Integer sum=0;
        List<Integer> intList1= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> intList2= Arrays.asList(1,6,7,8,9,10);
        List<Integer> duplicate=new ArrayList<>();
       for(Integer dub:intList1){
           if(intList2.contains(dub)){
               System.out.println(dub);
             sum=sum+dub;
           }
       }
       System.out.println(sum);
    }

}
