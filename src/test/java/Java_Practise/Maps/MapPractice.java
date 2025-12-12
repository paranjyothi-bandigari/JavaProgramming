package Java_Practise.Maps;

import java.util.*;

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
        for(Map.Entry<String,Integer> entry: Studentmarks.entrySet()){
            System.out.println(entry.getKey() +" : is the key");
            System.out.println(entry.getValue() +" : is the value");
        }

        System.out.println("=== HashMap ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5);
        hashMap.put("Mango", 2);
        //printMap(hashMap); // Order is unpredictable
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            if(entry.getKey().contains("Apple")){
                System.out.println(entry.getValue()+" is the Apple value ");
            }
        }

        System.out.println("=== LinkedHashMap ===");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 3);
        linkedHashMap.put("Apple", 5);
        linkedHashMap.put("Mango", 2);
        //printMap(linkedHashMap); // Maintains insertion order

        System.out.println("\n=== TreeMap ===");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 3);
        treeMap.put("Apple", 5);
        treeMap.put("Mango", 2);
        //printMap(treeMap); // Sorted by keys (alphabetically)



            // Explain the difference between HashMap and TreeMap.
            // difference between HashMap and Hashtable
            // How do you handle null keys and values in a HashMap
            // Explain how TreeMap maintains order.
            // How does a HashMap work in Java
            // Explain about looping in Map with EntrySet


        //Write a program to count the frequency of characters in a string using HashMap.
        String str = "automation";
        char[] aStr=str.toCharArray();
        Map<Character,Integer> strMap=new TreeMap<>();
        for(char c:aStr){
            strMap.put(c,strMap.getOrDefault(c,0)+1);
        }
       for(Map.Entry<Character,Integer> entry:strMap.entrySet()){
           System.out.println(entry.getKey()+" : "+entry.getValue());
       }



        //How would you sort a HashMap by its values?
        Map<String,Integer> mapSort=new HashMap<>();
        mapSort.put("A",10);
        mapSort.put("C",20);
        mapSort.put("B",30);
        List<Map.Entry<String,Integer>> list=new ArrayList<>(mapSort.entrySet());
list.sort(Map.Entry.comparingByValue());
Map<String,Integer> sortedMap=new LinkedHashMap<>();
for(Map.Entry<String,Integer> entry:list){
    sortedMap.put(entry.getKey(),entry.getValue());
}
        System.out.println(sortedMap);


        //List<Map.Entry<String,Integer>> list=new ArrayList<>(mapSort.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//        Map<String,Integer> sortedmap=new LinkedHashMap<>();
//        for(Map.Entry<String,Integer> entry:list){
//            sortedmap.put(entry.getKey(), entry.getValue());
//        }
//        System.out.println(sortedmap);

        // Find missing numbers in below given array :
        //arr[]={1,3,5,7,9,8,4}; given size=9; o/p should be = 2,6


        // Java Program to Find Occurrences of Elements in an Array
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};
Map<Integer,Integer> numMap=new TreeMap<>();
for(int n:numbers){
    if(numMap.containsKey(n)){
        numMap.put(n,numMap.get(n)+1);
    }else{
        numMap.put(n,1);
    }
}
     for(Map.Entry<Integer,Integer> enter: numMap.entrySet()){
         System.out.println(enter.getKey()+" is "+enter.getValue()+" time");
     }

        // How would you merge two HashMaps in Java
        Map<String, Integer> m1=new HashMap<>();
        m1.put("apple",1);
        m1.put("banana",2);
        Map<String, Integer> m2=new HashMap<>();
        m2.put("apple",1);
        m2.put("mango",3);

        m1.putAll(m2); //m2 map is added to m1 map
        System.out.println(m1);

        // Problem: Find the Longest Substring Without Repeating Characters
        //Example: Input: s = "abcabcbb"  Output: 3 Explanation: The answer is "abc", with a length of 3
//String input="abcabcbb"; //sliding window problem


        // Updating Values Using entrySet()
        Map<String, Integer> m3=new HashMap<>();
        m3.put("apple",1);
        m3.put("banana",2);
        m3.put("mango",3);
for(Map.Entry<String,Integer> entry: m3.entrySet()){
    if(entry.getKey().contains("apple")){
        entry.setValue(10);
    }
}
        System.out.println(m3);

        // Write a Java program that counts the occurrences of each word in a given sentence using a HashMap
        String Sent="java is fun and java is powerful";
        String[] sent=Sent.split(" ");
Map<String,Integer> sentMap=new TreeMap<>();
for(String s:sent){
    sentMap.put(s,sentMap.getOrDefault(s,0)+1);
}
        System.out.println(sentMap);

    }
}
