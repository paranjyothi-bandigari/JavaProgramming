package Java_Practise.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Integer> Studentmarks=new HashMap<>();
        //Hashmap order is unpredectable.
        Studentmarks.put("English",80);
        Studentmarks.put("Maths",100);
        Studentmarks.put("Telugu",95);
        Studentmarks.put("Hindi",85);
        Studentmarks.put("Science",96);
        Studentmarks.put("Social",92);


        for(Map.Entry<String,Integer> entry:Studentmarks.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("=== HashMap ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5);
        hashMap.put("Mango", 2);
        printMap(hashMap); // Order is unpredictable

        System.out.println("=== LinkedHashMap ===");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 3);
        linkedHashMap.put("Apple", 5);
        linkedHashMap.put("Mango", 2);
        printMap(linkedHashMap); // Maintains insertion order

        System.out.println("\n=== TreeMap ===");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 3);
        treeMap.put("Apple", 5);
        treeMap.put("Mango", 2);
        printMap(treeMap); // Sorted by keys (alphabetically)
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        //Write a program to count the frequency of characters in a string using HashMap.
//String str = "automation";
        //How would you sort a HashMap by its values?
        // Explain the difference between HashMap and TreeMap.
        // Java Program to Find Occurrences of Elements in an Array
        // difference between HashMap and Hashtable
        // How do you handle null keys and values in a HashMap
        // How would you merge two HashMaps in Java
        // Explain how TreeMap maintains order.
        // How does a HashMap work in Java
        // Find missing numbers in below given array :
        //arr[]={1,3,5,7,9,8,4}; given size=9; o/p should be = 2,6
        // Problem: Find the Longest Substring Without Repeating Characters
        //Example: Input: s = "abcabcbb"  Output: 3 Explanation: The answer is "abc", with a length of 3
        // Explain about looping in Map with EntrySet
        // Updating Values Using entrySet()
        // Write a Java program that counts the occurrences of each word in a given sentence using a HashMap
        // String Sent="java is fun and java is powerful"

    }
}
