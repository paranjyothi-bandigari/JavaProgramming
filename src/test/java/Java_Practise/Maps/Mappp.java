package Java_Practise.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mappp {
    public static void main(String[] args) {
        //create hashmap,linkedhashmap and Treemap
        // Explain the difference between HashMap and TreeMap.
        //        // difference between HashMap and Hashtable
        //        // How do you handle null keys and values in a HashMap
        //        // Explain how TreeMap maintains order.
        //        // How does a HashMap work in Java
        //         // Explain about looping in Map with EntrySet
        //Write a program to count the frequency of characters in a string using HashMap.
        String str = "automation";

        //How would you sort a HashMap by its values?

        // Find missing numbers in below given array :
        //arr[]={1,3,5,7,9,8,4}; given size=9; o/p should be = 2,6


        // Java Program to Find Occurrences of Elements in an Array
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};

        // How would you merge two HashMaps in Java
        Map<String, Integer> m1=new HashMap<>();
        m1.put("apple",1);
        m1.put("banana",2);
        Map<String, Integer> m2=new HashMap<>();
        m2.put("apple",1);
        m2.put("mango",3);

        // Problem: Find the Longest Substring Without Repeating Characters
        //Example: Input: s = "abcabcbb"  Output: 3 Explanation: The answer is "abc", with a length of 3
//String input="abcabcbb"; //sliding window problem


        // Updating Values Using entrySet()
        Map<String, Integer> m3=new HashMap<>();
        m3.put("apple",1);
        m3.put("banana",2);
        m3.put("mango",3);

        // Write a Java program that counts the occurrences of each word in a given sentence using a HashMap
        String Sent="java is fun and java is powerful";


        String nameWithDOB="John was born on 12-05-1990 and marry on 23/11/1983"; //patternmatch -[12-05-1990, 23/11/1983]

        String strCap="Hello there, I am Swetha and I work in Automation"; //Hello I Swetha I Automation

        //validate IPv4 address b/w o-255
        String IPv4="244.244.244.244";

        //1. Check if a string contains digits
        String inputdigts = "My phone number is 12345";
        Pattern pattern= Pattern.compile(".*\\d+");
        Matcher matcher=pattern.matcher(inputdigts);
        System.out.println(matcher.find());

//2. Validate email address

        String email = "test@example.com";



// 3. Extract numbers from a string


        String inputnum = "Order123, Invoice456";
        Pattern pattern1= Pattern.compile(".*\\d+.*");
        Matcher matcher1=pattern1.matcher(inputdigts);
        System.out.println(matcher1.find());

//4. Replace all whitespaces


        String messy = "Java   is \t awesome!";
        Pattern pattern2= Pattern.compile(".*\\s+.*");
        Matcher matcher2=pattern2.matcher(inputdigts);
        if(matcher2.find()){
            messy.replaceAll("\\t","");
        }
        System.out.println(messy);



// 5. Validate phone number (e.g., US format)


        String phone = "123-456-7890";




//        Bonus: Pattern Flags
//        You can make patterns case-insensitive:
//        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("I love Java");
//        System.out.println(matcher.find()); // true
//        Tips for Automation Testers:
//        Use regex in assertions with API responses.
//                Clean dynamic values from logs before validation.
//        Validate formats (email, timestamp, ID) using .matches().
//                Practice Exercise for You:
//        Write a regex to validate dates in format dd/mm/yyyy.
//                Extract all words starting with capital letters from a paragraph.
//                Replace all HTML tags with an empty string (basic HTML cleanup).


    }
}
