package JavaProgramming.Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String arr1="Listen";
        String arr2="Silent";

        String arrr1=arr1.toLowerCase();
        String arrr2=arr2.toLowerCase();

        char[] name1=arrr1.toCharArray();
        char[] name2=arrr2.toCharArray();

        Arrays.sort(name1);
        Arrays.sort(name2);

        if(Arrays.equals(name1,name2)){
            System.out.println("Anagram");
        } else
            System.out.println("not Anagram");

    }
}
