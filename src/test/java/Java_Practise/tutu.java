package Java_Practise;

import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.testng.annotations.Test;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tutu {
        @Test
        public void anagramProgram() {
//listen ↔ silent -- same letters different order and same length
            String anagramString1 = "listen";
            String anagramString2 = "silent";
            char[] sortedString1=anagramString1.toCharArray();
            char[] sortedString2=anagramString2.toCharArray();
            Arrays.sort(sortedString1);
            Arrays.sort(sortedString2);
                System.out.println(sortedString1);
                System.out.println(sortedString2);
            if(anagramString1.length()==anagramString2.length()){
                if(Arrays.equals(sortedString1,sortedString2)){
                        System.out.println("anagram");
                }else System.out.println("not anagram");
            }
        }

        @Test
        public void commonIntwoArrays() {
            int[] arr1 = {1, 2, 3, 4, 7};
            int[] arr2 = {3, 5, 7, 9};

        }

        @Test
        public void countPair() {
            //For an array of length n,
            // Number of pairs = n × (n - 1) / 2
                int[] arr={1,2,3,4,5,6};
                int n=arr.length;
                int pairs=n*(n-1)/2;
                System.out.println(pairs);

        }

        @Test
        public void countVowels() {

        }

        @Test
        public void elementStartDecrease() {

        }

        @Test
        public void expressionEvaluationRED() {


        }

        @Test
        public void firstandLastOccurance() {


        }

        @Test
        public void firstRepeatingElementInArray() {


        }

        //@Test
       // public void firststrSubsequenceOfsecond() {
        //}

        //private boolean isSubsequenceIgnoreCase(String a, String b) {

        //}

        @Test
        public void maxProductArrayOfposnegInteger() {
          }

        @Test
        public void mergeTwoSortedArray() {

        }

        @Test
        public void pairElements() {

        }

        @Test
        public void palindromeExample() { // rev of wor is same as given word then its palandrome
                String palandromeString = "A man a plan a canal Panama";
                String PString=palandromeString.toLowerCase();
                String rev="";
                PString=PString.replaceAll(" ","");
                for(int i=PString.length()-1;i>=0;i--){
                        rev=rev+PString.charAt(i);
                }
                System.out.println(rev);
                if(PString.equals(rev)){
                        System.out.println("Palandrome");
                }else
                        System.out.println("Not Palandrome");
        }

        @Test
        public void rearrangePosNegNumber() {

        }

        @Test
        public void removeConsecutiveDuplicate() {

        }

        @Test
        public void revWordInSentence() {

        }

        @Test
        public void rotatebyN() {


        }

        @Test
        public void secondlargestinArray() {

        }

        @Test
        public void secondSmallestElementInArray() {

        }

        @Test
        public void secondSmallestElementInArrayWithoutSorting() {

        }

        @Test
        public void segreggatearray() {

        }

        @Test
        public void sumUntilSingleDigit() {

        }





}
