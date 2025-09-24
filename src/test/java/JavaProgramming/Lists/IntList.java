package JavaProgramming.Lists;

import java.util.ArrayList;
import java.util.List;

public class IntList {
    public static void main(String[] args) {

        List<Integer> intList=new ArrayList<>();
        intList.add(2);
        intList.add(5);
        intList.add(7);
        intList.add(1);
        intList.add(8);
        intList.add(6);
        intList.add(9);
        for(Integer num:intList){
            if(num>2 && num%2==0){
               System.out.println(num +"Is greater than 2 and even");
            }else
                {
                System.out.println(num+"is either equal to 2 or odd");
            }
        }







    }
}
