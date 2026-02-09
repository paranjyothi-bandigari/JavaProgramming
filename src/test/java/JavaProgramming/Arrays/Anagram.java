package JavaProgramming.Arrays;

import java.util.Arrays;
//find the Anagram
public class Anagram {
    public static void main(String[] args) {
        String arr1="Listen";
        String arr2="Silent";

        char[] name1=arr1.toLowerCase().toCharArray();
        char[] name2=arr2.toLowerCase().toCharArray();

        Arrays.sort(name1);
        Arrays.sort(name2);

        if(Arrays.equals(name1,name2)){
            System.out.println("Anagram");
        } else
            System.out.println("not Anagram");

    }
}
