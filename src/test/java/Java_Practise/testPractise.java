package Java_Practise;

import org.apache.poi.hssf.record.chart.BarRecord;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.*;
import java.util.stream.IntStream;

//1. Write a Java method to check if a given substring exists within a string. string "Hello world" substring="Hello".
//2. Write a Java method to count the number of times a substring occurs in a given string
//3. Extracting a Subdomain from a URL: String url = "https://subdomain.example.com";
//4. Extracting a File Extension:String filename = "document.pdf";
//5. Reverse A string in 5 ways. a.Using StringBuilder or StringBuffer b.Using a for Loop c.Using Character Array d.Using Java 8 Streams e.Using Recursion
//6.check if a String is a palindrome?
//7. remove whitespace from the beginning and end of a String?
//8.  Explain how you would handle string comparisons in test automation assertions.
//Answer: Use the assertEquals method from a testing framework like JUnit or TestNG to compare expected and actual string values.
//9.: Describe a scenario where string manipulation might be necessary in test automation.
//Answer: String manipulation is necessary when dealing with dynamic data. For example, extracting specific parts of a URL to verify its correctness or formatting dates and times for input fields.
//10.ReverseWordsInSentence
//Concatenating strings using the + operator inside a loop can lead to performance issues because each concatenation creates a new string object. Instead, using StringBuilder or StringBuffer is recommended for efficient string manipulation.
//************************
//factorial, febonacci, is prime, rev a number, rev string, rev words in sentence, sub string, swap2 numbers without third

//Anagram
//CountVowels
//elementStartDecrease
//ExpressionEvaluationRED
//FirstandLastOccurance
//firststrSubsequenceOfsecond
//pairElements
//PalindromeExample
//RearrangePosNegNumber
//RemoveConsecutiveDuplicate
//RevWordInSentence
//rotatebyN
//************************
//check string contains digits
//check string contains special characters
//concat 2 strings
//count capital and small letters
//countcharactersDigitsSepecial chars
//count consonets vowels
//count occurance of each character string
//count wordsin string
//factorial of num
//find last unique char
//first letter of each word
//first non repeated character
//fizzbuzz
//highest occurance of char
//occuranceof given char
//palandrome and palandrome string
//percentage of vowels and consonents
//print duplicate characters with count
//remove all leading zeros
//remove characters from string
//remove duplicate characters from string
//remove duplicates elemets char
//remove special chars from string
//remove white spaces from string
//replace charactersin String
//reverse each word of string
//reverse string
//reverse words in string
//rev string ad sort string
//swap first and last char of string

//**************************************
//Reverse an Array
//Find the Missing Number {2,3,5,6,7,8};
//Find Duplicate Elements  int[] num={1,5,6,4,1,5};
// Merge Two Sorted Arrays
//Draw star pyramid using java
//Java Array Problem Using Two For Loops  //find the pair whose sum is 10
//Anagram
//Array in Assending order
//Even or odd
//first highest number
//Secondhighest number
//second lowest number
//sum of array
//@Test
public class testPractise{
    public static void main(String[] args) {
//        System.out.println("Hello World");
//    test001.myFirstClass();
//    test objAdd=new test();
//    objAdd.add(1,8);
        String s1 = "Hello world";
        String substring = "Hello";
        System.out.println(s1.contains(substring));

        String Word = "My name is name with a name of name";
        String[] word = Word.split(" ");
        int count = 0;
        for (String Words : word) {
            if (Words.contains("name")) {
                count++;
            }
        }
        System.out.println("Name is " + count + " times in words");

        String url = "https://subdomain.example.com";
        int first = url.indexOf("://") + 3;
        int Last = url.indexOf(".", first);
        System.out.println(url.substring(first, Last));

        String filename = "document.pdf";
        int LastIndex = filename.lastIndexOf(".") + 1;
        System.out.println(filename.substring(LastIndex));

        //Reverse a String
        StringBuilder sb = new StringBuilder(s1).reverse();
        System.out.println(sb);
        String reverses1 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverses1 += s1.charAt(i);
        }
        System.out.println(reverses1);
        char[] s1c = s1.toCharArray();

        String s2 = "  helllow   ";
        System.out.println(s2.trim());

        String n1 = "test";
        String n2 = "test";
        Assert.assertEquals(n1, n2, "Assertion pass");

        String Lastname = "Koppala";
        String Firstname = "Eesha";
        System.out.println(Lastname + " " + Firstname);

        int[] numbers = {1, 2, 3, 4};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("***************************");
        int[] missingnumbers = {2, 3, 5, 6, 7, 8};
        for (int i = 0; i < missingnumbers.length; i++) {
            if (missingnumbers[i + 1] != missingnumbers[i] + 1) {
                System.out.println(missingnumbers[i] + 1);
                break;
            }
        }
        int[] missingnumber = {1, 2, 3, 5, 6};
        //missing=expected-actualsum

        int n = 6; //n*(n+1)/2
        int actualsum = 0;
        int expected = n * (n + 1) / 2;
        for (int ms : missingnumber) {
            actualsum = actualsum + ms;
        }
        int missingnum = expected - actualsum;
        System.out.println("$$$$$$$$$$");
        System.out.println(missingnum);
        System.out.println("$$$$$$$$$$");

        int[] num = {1, 5, 6, 4, 1, 5};
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    duplicate.add(num[i]);
                } else {
                    list1.add(num[i]);
                }
            }
        }
        System.out.println(duplicate);
// Merge Two Sorted Arrays
        int[] arr1 = {2, 3, 4, 8};
        int[] arr2 = {5, 6, 7};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        System.out.println(list);

//Draw star pyramid using java
        int numb = 5;
        for (int i = 1; i <= numb; i++) {
            for (int j = i + 1; j < numb; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //find the pair whose sum is 10
        int[] arr = {2, 7, 4, -5, 11, 5, 20, 8, 3, 6};
        int target = 10;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");
                }
            }
        }
        //palandrome
            String name="madam";
            String rev="";
                for(int i=name.length()-1;i>=0;i--){
                   rev=rev+name.charAt(i);
            }
                if(name.equals(rev)){
                    System.out.println(name+" Palandrome "+rev);
                }
                else{
                    System.out.println("Not Palandrome");
                }
        //ReverseWordsInSentence
        String sentence = "my name is joe";
        String[] words = sentence.split(" ");
        StringBuilder reverseSent=new StringBuilder();
        for(String wordd:words){
            StringBuilder revWord=new StringBuilder(wordd).reverse();
            reverseSent.append(revWord).append(" ");
        }
        System.out.println(reverseSent.toString().trim());

        int[] unsortedA1={1,2,6,8};
        int[] unsortedA2={9,5,7,0};
        int[] mergedA={unsortedA1.length+unsortedA2.length};
        mergedA= IntStream.concat(Arrays.stream(unsortedA1), Arrays.stream(unsortedA2)).sorted().toArray();
        System.out.println(mergedA);

    }
    }


