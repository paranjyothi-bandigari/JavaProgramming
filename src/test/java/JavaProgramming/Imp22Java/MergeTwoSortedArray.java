package JavaProgramming.Imp22Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] a={2,3,5};
        int[] b={6,1,8};
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList list=new ArrayList();
        for(int n:a){
            list.add(n);
        }
        for(int m:b) {
            list.add(m);
        }
        System.out.println(list);
}}
