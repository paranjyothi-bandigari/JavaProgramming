package JavaProgramming.Imp22Java;

import java.util.Arrays;

/* function to check whether two strings are
	    anagram of each other */
//To determine if two strings are anagrams, they must contain
// the same characters with the same frequencies, regardless
// of the order of characters.
public class Anagram {
    public static void main(String[] args) {
        String s1="Paranjyothi";
        String s2="paranjyoith";
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()==s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(c1.equals(c2)){}
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");

        }
    }

}
