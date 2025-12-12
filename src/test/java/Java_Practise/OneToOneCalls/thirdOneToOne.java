package Java_Practise.OneToOneCalls;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class thirdOneToOne {
    public static void main(String[] args) {
        Map<String,Integer> fruitsMap=new TreeMap<>();
        fruitsMap.put("Apple",5);
        fruitsMap.put("Mango",3);
        fruitsMap.put("Banana",2);
        System.out.println(fruitsMap);
//        for(Map.Entry<String,Integer> entry:fruitsMap.entrySet()){
//
//                System.out.println(entry.);
//
//        }
        String test="testing"; //Set using
        Map<Character,Integer> testMap=new LinkedHashMap<>();
        for(char c:test.toCharArray()){
            testMap.put(c,testMap.getOrDefault(c,0)+1);
        }
       for(Map.Entry<Character,Integer> entry:testMap.entrySet()){
           if(entry.getValue()==1){
               System.out.print(entry.getKey());
           }
       }
Pattern pattern=Pattern.compile("^[AEIOUaeiou].*");
Matcher matcher=pattern.matcher("");
while(matcher.find()){



}

    }

}
